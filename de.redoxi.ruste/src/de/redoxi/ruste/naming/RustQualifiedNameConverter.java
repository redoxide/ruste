package de.redoxi.ruste.naming;

import org.eclipse.xtext.naming.IQualifiedNameConverter.DefaultImpl;

public class RustQualifiedNameConverter extends DefaultImpl {

    public final static String NAMESPACE_DELIMITER = "::";
    
    @Override
    public String getDelimiter() {
	return NAMESPACE_DELIMITER;
    }
}
