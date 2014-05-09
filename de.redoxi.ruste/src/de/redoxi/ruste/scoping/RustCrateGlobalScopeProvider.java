package de.redoxi.ruste.scoping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.LoadOnDemandResourceDescriptions;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;
import org.eclipse.xtext.util.IResourceScopeCache;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;

import de.redoxi.ruste.rust.CrateItem;
import de.redoxi.ruste.rust.ExternModDecl;
import de.redoxi.ruste.rust.ModItem;
import de.redoxi.ruste.rust.UseDecl;

public class RustCrateGlobalScopeProvider extends DefaultGlobalScopeProvider {

    // TODO Hard coded for now
    private static final URI RUST_SRC_URI = URI.createFileURI("/Users/hayden/Projects/rust/src");
    
    @Inject
    private Provider<LoadOnDemandResourceDescriptions> loadOnDemandDescriptions;

    @Inject
    private IResourceScopeCache cache;
    
    @Inject
    private IQualifiedNameConverter qualifiedNameConverter;
    
    @Inject
    private IQualifiedNameProvider qualifiedNameProvider;
    
    @Override
    protected IScope getScope(Resource resource, boolean ignoreCase, EClass type, Predicate<IEObjectDescription> filter) {
	final LinkedHashSet<URI> externCrateURIs = getCrateURIs(resource);
	IResourceDescriptions descriptions = getResourceDescriptions(resource, externCrateURIs);
	List<URI> urisAsList = Lists.newArrayList(externCrateURIs);
	Collections.reverse(urisAsList);
	IScope scope = IScope.NULLSCOPE;
	for (URI uri : urisAsList) {
	    scope = createLazyResourceScope(scope, uri, descriptions, type, filter, ignoreCase);
	}
	
	for(UseDecl useDecl : getUseDecls(resource)) {
	    QualifiedName prefix = qualifiedNameConverter.toQualifiedName(useDecl.getImportedNamespace());
	    IScope fileScope = createLazyResourceScope(IScope.NULLSCOPE, getUseURI(useDecl, null, resource.getURI()), descriptions, type, filter, ignoreCase);
	    scope = new RustUseScope(fileScope, scope, prefix, ignoreCase);
	}
	
	// Include std::* source
	scope = createLazyResourceScope(scope, RUST_SRC_URI.appendSegment("libstd").appendSegment("lib").appendFileExtension("rs"), descriptions, type, filter, ignoreCase);
	
	return scope;
    }

    protected LinkedHashSet<URI> getCrateURIs(final Resource resource) {
	return cache.get(RustCrateGlobalScopeProvider.class.getName(), resource, new Provider<LinkedHashSet<URI>>() {
	    public LinkedHashSet<URI> get() {
		final LinkedHashSet<URI> uris = new LinkedHashSet<URI>(5);
		
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
		    EObject object = iterator.next();
		    
		    collectModURIs(object, resource.getURI(), uris);
		    
		    URI uri = null;
		    
		    if (object instanceof CrateItem) {
			uri = getCrateURI((CrateItem) object);
		    }
		    
		    if (uri != null) {
			uris.add(uri);
		    }
		}
		Iterator<URI> uriIter = uris.iterator();
		while (uriIter.hasNext()) {
		    if (!EcoreUtil2.isValidUri(resource, uriIter.next()))
			uriIter.remove();
		}
		return uris;
	    }
	});
    }
    
    public IResourceDescriptions getResourceDescriptions(Resource resource, Collection<URI> crateUris) {
	IResourceDescriptions result = getResourceDescriptions(resource);
	LoadOnDemandResourceDescriptions demandResourceDescriptions = loadOnDemandDescriptions.get();
	demandResourceDescriptions.initialize(result, crateUris, resource);
	return demandResourceDescriptions;
    }

    protected IScope createLazyResourceScope(IScope parent, final URI uri, final IResourceDescriptions descriptions, EClass type,
	    final Predicate<IEObjectDescription> filter, boolean ignoreCase) {
	IResourceDescription description = descriptions.getResourceDescription(uri);
	return SelectableBasedScope.createScope(parent, description, filter, type, ignoreCase);
    }
    
    private URI getExternCrateURI(ExternModDecl externCrateDecl) {
	String crateName = externCrateDecl.getName();
	
	if (externCrateDecl.getExternalIdent() != null) {
	    String externalIdent = externCrateDecl.getExternalIdent().getValue();
	    crateName = externalIdent;
	    
	    int versionIndex = externalIdent.indexOf('#');
	    if (versionIndex >= 0) {
		crateName = externalIdent.substring(0, versionIndex);
	    }
	}
	
	// TODO Overwrite with path attribute if given
	
	return RUST_SRC_URI.appendSegment("lib" + crateName).appendSegment("lib").appendFileExtension("rs");
    }
    
    protected URI getCrateURI(CrateItem crateItem) {
	if (crateItem.getItem() instanceof ExternModDecl) {
	    return getExternCrateURI((ExternModDecl) crateItem.getItem());
	}
	
	return null;
    }
    
    // TODO Check for `mod <name>;' items?
    private void collectModURIs(EObject root, URI relativeTo, Set<URI> uris) {
	if (root instanceof ModItem && ((ModItem) root).isExternalBody()) {
	    uris.add(getCrateURI((ModItem) root, relativeTo));
	} /*else if (root instanceof UseDecl) {
	    // TODO Get scope
	    uris.add(getUseURI((UseDecl) root, null, relativeTo));
	}*/ else {
	    TreeIterator<EObject> iter = root.eAllContents();
	    while (iter.hasNext()) {
		collectModURIs(iter.next(), relativeTo, uris);
	    }
	}
    }
    
    // TODO Move to local scope provider
    // TODO Look at attributes for `path'
    protected URI getCrateURI(ModItem modItem, URI relativeToURI) {
	QualifiedName modQN = qualifiedNameProvider.getFullyQualifiedName(modItem);
	URI crateURI = relativeToURI.trimSegments(1);
	
	// First segment is crate name
	modQN = modQN.skipFirst(1);
	
	for (String segment : modQN.getSegments()) {
	    crateURI = crateURI.appendSegment(segment);
	}
	
	// Look for `<mod name>.rs'
	crateURI = crateURI.appendFileExtension("rs");
	
	// Try `<mod name>/mod.rs' instead
	if (crateURI.isEmpty())
	    crateURI = crateURI.appendSegment("mod").appendFileExtension("rs");
	
	return crateURI;
    }
    
    // TODO Move to local scope provider
    // TODO Look at attributes for `path'
    protected URI getUseURI(UseDecl useDecl, IScope scope, URI relativeToURI) {
	QualifiedName modQN = qualifiedNameConverter.toQualifiedName(useDecl.getImportedNamespace());
	URI crateURI = RUST_SRC_URI;
	
	crateURI = crateURI.appendSegment("lib" + modQN.getFirstSegment());
	
	for (String segment : modQN.skipFirst(1).getSegments()) {
	    crateURI = crateURI.appendSegment(segment);
	}
	
	// Look for `<mod name>.rs'
	crateURI = crateURI.appendFileExtension("rs");
	
	// Try `<mod name>/mod.rs' instead
	if (crateURI.isEmpty())
	    crateURI = crateURI.appendSegment("mod").appendFileExtension("rs");
	
	return crateURI;
    }
    
    protected List<UseDecl> getUseDecls(Resource resource) {
	ArrayList<UseDecl> useDecls = new ArrayList<UseDecl>();
	TreeIterator<EObject> iterator = resource.getAllContents();
	while (iterator.hasNext()) {
	    EObject object = iterator.next();
	    
	    if (object instanceof UseDecl) {
		useDecls.add((UseDecl) object);
	    }
	}
	return useDecls;
    }
}
