/*
* generated by Xtext
*/
package de.redoxi.ruste.ui.labeling

import com.google.inject.Inject
import de.redoxi.ruste.rust.UseDecl
import de.redoxi.ruste.rust.StructItem
import de.redoxi.ruste.rust.EnumItem
import de.redoxi.ruste.rust.TraitItem
import de.redoxi.ruste.rust.ModItem
import de.redoxi.ruste.rust.FnItem
import de.redoxi.ruste.rust.Visibility
import de.redoxi.ruste.rust.StaticItem
import de.redoxi.ruste.rust.StructField

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class RustLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
//	def text(Greeting ele) {
//		'A greeting to ' + ele.name
//	}
//
//	def image(Greeting ele) {
//		'Greeting.gif'
//	}

		override text(Object element) {
			element.toString
		}

		// Use declarations
		/*def text(UseDecl useDecl) {
			useDecl.toString
		}*/
		
		def image(UseDecl useDecl) {
			'use_obj.png'
		}

		def image(StructItem structItem) {
			'struct_obj.png'
		}

		def image(EnumItem enumItem) {
			'enum_obj.png'
		}
		
		def image(TraitItem traitItem) {
			'trait_obj.png'
		}
		
		def image(ModItem modItem) {
			if (modItem.items.empty) 
				'empty_module_obj.png'
			else
				'module_obj.png'
		}
		
		def image(FnItem fnItem) {
			switch (fnItem.vis) {
				case Visibility.PUBLIC:
					return 'methpub_obj.png'
				default:
					return 'methpri_obj.png'
			}
		}
		
		def image(StaticItem staticItem) {
			switch (staticItem.vis) {
				case Visibility.PUBLIC:
					return 'static_field_public_obj.png'
				default:
					return 'static_field_private_obj.png'
			}
		}
		
		def image(StructField structField) {
			switch (structField.vis) {
				case Visibility.PUBLIC:
					return 'static_field_public_obj.png'
				default:
					return 'static_field_private_obj.png'
			}
		}
}
