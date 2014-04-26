package de.redoxi.ruste.scoping;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.LoadOnDemandResourceDescriptions;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;
import org.eclipse.xtext.util.IResourceScopeCache;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;

import de.redoxi.ruste.rust.CrateItem;
import de.redoxi.ruste.rust.ExternModDecl;

public class RustCrateGlobalScopeProvider extends DefaultGlobalScopeProvider {

    // TODO Hard coded for now
    private static final URI RUST_SRC_URI = URI.createFileURI("/Users/hayden/Projects/rust/src");
    
    @Inject
    private Provider<LoadOnDemandResourceDescriptions> loadOnDemandDescriptions;

    @Inject
    private IResourceScopeCache cache;
    
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
	return scope;
    }

    protected LinkedHashSet<URI> getCrateURIs(final Resource resource) {
	return cache.get(ImportUriGlobalScopeProvider.class.getName(), resource, new Provider<LinkedHashSet<URI>>() {
	    public LinkedHashSet<URI> get() {
		final LinkedHashSet<URI> uris = new LinkedHashSet<URI>(5);
		
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
		    EObject object = iterator.next();
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
    
    protected URI getCrateURI(CrateItem crateItem) {
	if (!(crateItem.getItem() instanceof ExternModDecl)) {
	    return null;
	}
	
	ExternModDecl externCrateDecl = (ExternModDecl) crateItem.getItem();
	
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
}
