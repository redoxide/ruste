package de.redoxi.ruste.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;

import com.google.inject.Singleton;

@Singleton
public class RustValueConverterService extends
	AbstractDeclarativeValueConverterService {
    
    @ValueConverter(rule = "STRING")
    public IValueConverter<String> getStringConverter() {
	return new StringConverter();
    }
}
