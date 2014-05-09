package de.redoxi.ruste.scoping;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;

public class RustNormalizer extends ImportNormalizer {

    private final boolean hasWildCard;

    public RustNormalizer(QualifiedName importedNamespace, boolean wildCard, boolean ignoreCase) {
	super(importedNamespace, wildCard, ignoreCase);
	hasWildCard = wildCard;
    }

    public QualifiedName deresolve(QualifiedName fullyQualifiedName) {
	if (hasWildCard) {
	    if (!isIgnoreCase()) {
		if (fullyQualifiedName.startsWith(getImportedNamespacePrefix()) && fullyQualifiedName.getSegmentCount() != getImportedNamespacePrefix().getSegmentCount()) {
		    return fullyQualifiedName.skipFirst(getImportedNamespacePrefix().getSegmentCount());
		}
	    } else {
		if (fullyQualifiedName.startsWithIgnoreCase(getImportedNamespacePrefix())
			&& fullyQualifiedName.getSegmentCount() != getImportedNamespacePrefix().getSegmentCount()) {
		    return fullyQualifiedName.skipFirst(getImportedNamespacePrefix().getSegmentCount());
		}
	    }
	} else {
	    if (!isIgnoreCase()) {
		if (fullyQualifiedName.startsWith(getImportedNamespacePrefix()))
		    return fullyQualifiedName.skipFirst(getImportedNamespacePrefix().getSegmentCount()).append(getImportedNamespacePrefix().getLastSegment());
	    } else {
		if (fullyQualifiedName.startsWithIgnoreCase(getImportedNamespacePrefix()))
		    return fullyQualifiedName.skipFirst(getImportedNamespacePrefix().getSegmentCount()).append(getImportedNamespacePrefix().getLastSegment());
	    }
	}
	return null;
    }

    public QualifiedName resolve(QualifiedName relativeName) {
	if (relativeName.isEmpty())
	    return null;
	if (hasWildCard) {
	    return getImportedNamespacePrefix().append(relativeName);
	} else {
	    if (!isIgnoreCase()) {
		return getOverlappingQualifiedName(getImportedNamespacePrefix(), relativeName);
	    } else {
		return getOverlappingQualifiedNameIgnoreCase(getImportedNamespacePrefix(), relativeName);
	    }
	}
    }
    
    private QualifiedName getOverlappingQualifiedName(QualifiedName prefix, QualifiedName suffix) {
	if (prefix.getSegmentCount() > suffix.getSegmentCount()) {
	    return null;
	}
	
	for (int i = 0; i < prefix.getSegmentCount(); i++) {
	    if (suffix.startsWith(prefix.skipFirst(i))) {
		return prefix.append(suffix.skipFirst(prefix.getSegmentCount() - i));
	    }
	}
	
	return null;
    }
    
    private QualifiedName getOverlappingQualifiedNameIgnoreCase(QualifiedName prefix, QualifiedName suffix) {
	if (prefix.getSegmentCount() > suffix.getSegmentCount()) {
	    return null;
	}
	
	for (int i = 0; i < prefix.getSegmentCount(); i++) {
	    if (suffix.startsWithIgnoreCase(prefix.skipFirst(i))) {
		return prefix.append(suffix.skipFirst(i));
	    }
	}
	
	return null;
    }
}
