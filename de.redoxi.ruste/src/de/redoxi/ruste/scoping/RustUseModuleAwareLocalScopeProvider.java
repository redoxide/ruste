package de.redoxi.ruste.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

import com.google.common.collect.Lists;

import de.redoxi.ruste.rust.ExternModDecl;
import de.redoxi.ruste.rust.UseDecl;

public class RustUseModuleAwareLocalScopeProvider extends
	ImportedNamespaceAwareLocalScopeProvider {

    @Override
    protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, boolean ignoreCase) {
	List<ImportNormalizer> importedNamespaceResolvers = Lists.newArrayList();
	collectImportedNamespaces(context, ignoreCase, importedNamespaceResolvers);
	return importedNamespaceResolvers;
    }
    
    private void collectImportedNamespaces(final EObject context, boolean ignoreCase, final List<ImportNormalizer> importedNamespaceResolvers) {
	if (context instanceof UseDecl) {
	    String value = getImportedNamespace(context);
	    ImportNormalizer resolver = createImportedNamespaceResolver(value, ignoreCase);
	    if (resolver != null)
		importedNamespaceResolvers.add(resolver);
	} else if (context instanceof ExternModDecl) {
	    ImportNormalizer resolver = createImportedNamespaceResolver(getImportedNamespaceForCrate((ExternModDecl) context), ignoreCase);
	    if (resolver != null)
		importedNamespaceResolvers.add(resolver);
	} else {
	    EList<EObject> eContents = context.eContents();
	    for (EObject child : eContents) {
		collectImportedNamespaces(child, ignoreCase, importedNamespaceResolvers);
	    }
	}
    }
    
    @Override
    protected List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
	List<ImportNormalizer> implicitNamespaces = new ArrayList<ImportNormalizer>(1);
	
	// Implicitly include std::*;
	implicitNamespaces.add(new ImportNormalizer(QualifiedName.create("std"), true, false));
	
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
}
