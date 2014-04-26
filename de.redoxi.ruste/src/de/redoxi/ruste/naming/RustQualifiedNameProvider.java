package de.redoxi.ruste.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import de.redoxi.ruste.rust.Attr;
import de.redoxi.ruste.rust.Crate;
import de.redoxi.ruste.rust.CrateAttr;
import de.redoxi.ruste.rust.EnumVariant;
import de.redoxi.ruste.rust.StringLit;

/**
 * Retrieves the fully qualified name of the given element.
 * 
 * @author Hayden Smith
 * @since 0.1.0
 */
public class RustQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

    private static final String CRATE_ID = "crate_id";
    
    @Override
    public QualifiedName getFullyQualifiedName(EObject e) {
	QualifiedName qn = null;
	
	if (e instanceof Crate) {
	    // The fully-qualified name of a crate is given by the crate's crate_id attribute
	    qn = QualifiedName.create(getCrateId((Crate) e));
	} else if (e instanceof EnumVariant) {
	    // FQN of an enum variant does not include the enum itself
	    qn = getFullyQualifiedName(e.eContainer().eContainer()).append(((EnumVariant) e).getName());
	} else {
	    qn = super.getFullyQualifiedName(e);
	}
	
	return qn;
    }
    
    private String getCrateId(Crate crate) {
	for(CrateAttr crateAttr : crate.getAttrs()) {
	    for(Attr attr : crateAttr.getAttrs()) {
		if (CRATE_ID.equals(attr.getName()) && attr.getValue() instanceof StringLit) {
		    String crateIdAndVersion = ((StringLit) attr.getValue()).getValue();
		    // Strip leading and trailing quotes
		    crateIdAndVersion = crateIdAndVersion.substring(1, crateIdAndVersion.length() - 2);
		    
		    int versionIndex = crateIdAndVersion.indexOf('#');
		    // Do not return version substring if it exists
		    // TODO Include version in path at some point
		    return versionIndex < 0 ? crateIdAndVersion : crateIdAndVersion.substring(0, versionIndex);
		}
	    }
	}
	
	return crate.eResource().getURI().trimFileExtension().lastSegment();
    }
}
