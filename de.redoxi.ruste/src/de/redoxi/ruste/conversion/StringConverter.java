package de.redoxi.ruste.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class StringConverter implements IValueConverter<String> {

    @Override
    public String toValue(String string, INode node)
	    throws ValueConverterException {
	// TODO Escape unicode chars
	return string.replace("\\\n", "\n");
    }

    @Override
    public String toString(String value) throws ValueConverterException {
	// TODO Encode unicode char
	return value.replace("\n", "\\\n");
    }

}
