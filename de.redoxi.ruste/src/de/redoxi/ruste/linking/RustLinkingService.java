package de.redoxi.ruste.linking;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.inject.Inject;

import de.redoxi.ruste.rust.NamedItem;

/**
 * Resolves links between {@link NamedItem}s in the grammar and fully-qualified or aliased names that reference
 * them in types or expressions.
 * 
 * @author Hayden Smith
 *
 */
public class RustLinkingService extends DefaultLinkingService {

    private static final Logger logger = Logger.getLogger(DefaultLinkingService.class);
    
    @Inject
    private IQualifiedNameConverter qualifiedNameConverter;
    
    /**
     * @return the first element returned from the injected
     *         {@link IScopeProvider} which matches the text of the passed
     *         {@link INode node}
     */
    public List<EObject> getLinkedObjects(EObject context, EReference ref, INode node) throws IllegalNodeException {
	final EClass requiredType = ref.getEReferenceType();
	if (requiredType == null)
	    return Collections.<EObject> emptyList();

	final String crossRefString = getCrossRefNodeAsString(node);
	if (crossRefString != null && !crossRefString.equals("")) {
	    if (logger.isDebugEnabled()) {
		logger.debug("before getLinkedObjects: node: '" + crossRefString + "'");
	    }
	    final IScope scope = getScope(context, ref);
	    QualifiedName qualifiedLinkName = qualifiedNameConverter.toQualifiedName(crossRefString);
	    IEObjectDescription eObjectDescription = scope.getSingleElement(qualifiedLinkName);
	    
	    if (eObjectDescription == null) {
		eObjectDescription = resolvePossibleAlias(qualifiedLinkName, scope);
	    }
	    
	    if (logger.isDebugEnabled()) {
		logger.debug("after getLinkedObjects: node: '" + crossRefString + "' result: " + eObjectDescription);
	    }
	    
	    if (eObjectDescription != null)
		return Collections.singletonList(eObjectDescription.getEObjectOrProxy());
	}
	return Collections.emptyList();
    }
    
    private IEObjectDescription resolvePossibleAlias(QualifiedName qualifiedLinkName, IScope scope) {
	QualifiedName aliasedItem = QualifiedName.create(qualifiedLinkName.getFirstSegment());
	IEObjectDescription aliasedObjectDescription = scope.getSingleElement(aliasedItem);
	
	if (aliasedObjectDescription == null) {
	    return null;
	}
	
	// TODO Does this need to be recursive?
	QualifiedName aliasedItemHead = aliasedObjectDescription.getQualifiedName();
	QualifiedName aliasedItemTail = qualifiedLinkName.skipFirst(1);
	QualifiedName qualifiedName = aliasedItemHead.append(aliasedItemTail);
	
	return scope.getSingleElement(qualifiedName);
    }
}
