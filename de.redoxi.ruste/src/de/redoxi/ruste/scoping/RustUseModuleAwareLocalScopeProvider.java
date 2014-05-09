package de.redoxi.ruste.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.util.Strings;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

import de.redoxi.ruste.rust.ExternModDecl;
import de.redoxi.ruste.rust.ModItem;
import de.redoxi.ruste.rust.UseDecl;

public class RustUseModuleAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

    @Inject
    protected IQualifiedNameProvider qualifiedNameProvider;

    @Inject
    protected IQualifiedNameConverter qualifiedNameConverter;

    @Override
    protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, boolean ignoreCase) {
	List<ImportNormalizer> importedNamespaceResolvers = Lists.newArrayList();
	collectImportedNamespaces(context, ignoreCase, importedNamespaceResolvers);
	return importedNamespaceResolvers;
    }

    private void collectImportedNamespaces(final EObject context, boolean ignoreCase, final List<ImportNormalizer> importedNamespaceResolvers) {
	if (context instanceof UseDecl) {
	    String value = getImportedNamespace(context);
	    importedNamespaceResolvers.addAll(createImportedNamespaceResolvers(value, ignoreCase));
	} else if (context instanceof ExternModDecl) {
	    importedNamespaceResolvers.addAll(createImportedNamespaceResolvers(getImportedNamespaceForCrate((ExternModDecl) context), ignoreCase));
	} else if (context instanceof ModItem && ((ModItem) context).isExternalBody()) {
	    QualifiedName qn = getParentQualifiedName(context);
	    ImportNormalizer resolver = new ImportNormalizer(qn, false, ignoreCase);
	    if (resolver != null)
		importedNamespaceResolvers.add(resolver);
	} else {
	    EList<EObject> eContents = context.eContents();
	    for (EObject child : eContents) {
		collectImportedNamespaces(child, ignoreCase, importedNamespaceResolvers);
	    }
	}
    }

    /**
     * Create a new {@link ImportNormalizer} for the given namespace.
     * 
     * @param namespace
     *            the namespace.
     * @param ignoreCase
     *            <code>true</code> if the resolver should be case insensitive.
     * @return a new {@link ImportNormalizer} or <code>null</code> if the
     *         namespace cannot be converted to a valid qualified name.
     */
    protected List<ImportNormalizer> createImportedNamespaceResolvers(final String namespace, boolean ignoreCase) {
	ArrayList<ImportNormalizer> normalizers = new ArrayList<ImportNormalizer>();

	if (Strings.isEmpty(namespace))
	    return normalizers;
	QualifiedName importedNamespace = qualifiedNameConverter.toQualifiedName(namespace);
	if (importedNamespace == null || importedNamespace.getSegmentCount() < 1) {
	    return normalizers;
	}
	boolean hasWildCard = ignoreCase ? importedNamespace.getLastSegment().equalsIgnoreCase(getWildCard()) : importedNamespace.getLastSegment().equals(
		getWildCard());
	boolean hasGlob = importedNamespace.getLastSegment().startsWith("{");

	if (hasWildCard) {
	    if (importedNamespace.getSegmentCount() <= 1)
		return null;
	    normalizers.add(doCreateImportNormalizer(importedNamespace.skipLast(1), true, ignoreCase));
	} else if (hasGlob) {
	    String[] identifiers = importedNamespace.getLastSegment().substring(1, importedNamespace.getLastSegment().length() - 1).split(",");
	    for (String identifier : identifiers) {
		identifier = identifier.trim();
		normalizers.add(doCreateImportNormalizer(importedNamespace.skipLast(1).append(identifier), false, ignoreCase));
	    }
	} else {
	    normalizers.add(doCreateImportNormalizer(importedNamespace, false, ignoreCase));
	}

	return normalizers;
    }

    protected RustNormalizer doCreateImportNormalizer(QualifiedName importedNamespace, boolean wildcard, boolean ignoreCase) {
	return new RustNormalizer(importedNamespace, wildcard, ignoreCase);
    }

    @Override
    protected List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
	List<ImportNormalizer> implicitNamespaces = new ArrayList<ImportNormalizer>(1);

	// Implicitly include std::prelude::*;
	implicitNamespaces.add(new RustNormalizer(QualifiedName.create("std", "prelude"), true, false));

	return implicitNamespaces;
    }

    protected String getImportedNamespaceForCrate(ExternModDecl externCrateDecl) {
	String crateName = externCrateDecl.getName();

	if (externCrateDecl.getExternalIdent() != null) {
	    String externalIdent = externCrateDecl.getExternalIdent().getValue();
	    crateName = externalIdent;

	    int versionIndex = externalIdent.indexOf('#');
	    if (versionIndex >= 0) {
		crateName = externalIdent.substring(0, versionIndex);
	    }
	}

	return crateName;
    }

    private QualifiedName getParentQualifiedName(EObject object) {
	QualifiedName qn = null;
	while (qn == null) {
	    object = object.eContainer();
	    qn = qualifiedNameProvider.getFullyQualifiedName(object);
	}
	return qn;
    }
}
