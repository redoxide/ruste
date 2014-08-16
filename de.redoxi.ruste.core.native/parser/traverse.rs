extern crate syntax;

use self::syntax::ast;
use self::syntax::codemap::{CodeMap, Loc};
use self::syntax::parse::token::get_name;
use self::syntax::owned_slice::OwnedSlice;
use std::string::String;

pub fn traverse_crate(name: &str, cr: &ast::Crate, codemap: &CodeMap, public: bool) {
	
	
	traverse_module(&cr.module, codemap, public);
	
	
}

pub fn traverse_view_item(view_item: &ast::ViewItem, codemap: &CodeMap) {
	// TODO Create view items
}

pub fn traverse_item(item: &ast::Item, codemap: &CodeMap, public: bool) {
	// let _ident = get_name(item.ident.name).get();
	
	let item_is_public = match item.vis {
		ast::Public => true,
		_ => false
	};
	
	// Do not expand this AST node if the public flag is set and this item is not public, or doesn't inherit public visibility
	if public && !item_is_public {
		return
	}

	let vis = match item.vis {
		ast::Public => "public".to_string(),
		_ => "".to_string()
	};
	
	match item.node {
		ast::ItemMod(ref module) => {
			let mut path = "".to_string();
			
			// Set the path attribute for this module
			for attr in item.attrs.iter() {
				match attr.node.value.node {
					ast::MetaNameValue(ref name, ref l) if name.get() == "path" => { 
						match l.node {
							ast::LitStr(ref path_val, ref style) => { path = path_val.get().to_string(); },
							_ => ()
						} 
					},
					_ => ()
				}
			}
		
			
			
			traverse_module(module, codemap, public);
			
			
		},
		ast::ItemForeignMod(ref foreign_module) => {
			let mut path = "".to_string();
			
			// Set the path attribute for this module
			for attr in item.attrs.iter() {
				match attr.node.value.node {
					ast::MetaNameValue(ref name, ref l) if name.get() == "path" => { 
						match l.node {
							ast::LitStr(ref path_val, ref style) => { path = path_val.get().to_string(); },
							_ => ()
						} 
					},
					_ => ()
				}
			}
		
			
			
			traverse_foreign_module(foreign_module, codemap, public);
			
			
		},
		ast::ItemFn(ref f, ref pur, ref abi, ref generics, ref block) => {
			let _ty = codemap.span_to_snippet(f.output.span);
			
			let _tyStr = match _ty {
				Some(a) => a.to_owned(),
				None => "".to_string()
			};
			
			
			
			traverse_generics(generics, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi), codemap);
			
			for a in f.inputs.iter() {
				traverse_arg(a, codemap);
			}		
			
			// TODO Collect references within function
			
			
		},
		ast::ItemStruct(ref s, ref generics) => {
			
			
			traverse_generics(generics, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi), codemap);
			
			for f in s.fields.iter() {
				traverse_struct_field(f, codemap);
			}
			
			
		},
		ast::ItemTrait(ref generics, ref bound_opt, ref trait_refs, ref trait_methods) => {
			
			traverse_generics(generics, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi), codemap);
			traverse_trait(generics, trait_refs, trait_methods, codemap);
			
		},
		ast::ItemEnum(ref e, ref generics) => {
			
			traverse_generics(generics, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi), codemap);
			traverse_enum(e, codemap);
			
		},
		ast::ItemImpl(ref generics, ref optional_trait_ref, ref ty, ref methods) => {
			traverse_generics(generics, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi), codemap);
			
			// TODO Map crate to resolve trait name
			let opt_trait = match *optional_trait_ref {
				Some(ref t) => "".to_string(),
				None => "".to_string()
			};
			
			let _ty = codemap.span_to_snippet(ty.span);
			
			let _tyStr = match _ty {
				Some(s) => s.to_owned(),
				None => "".to_string()
			};
			
			
			
			for _method in methods.iter() {
				traverse_method(_method.deref(), codemap);
			}
			
			
		},
		ast::ItemTy(ref ty, ref generics) => {
			let _ty = codemap.span_to_snippet(ty.span);
			
			let _tyStr = match _ty {
				Some(s) => s.to_owned(),
				None => "".to_string()
			};
			
			
			
			traverse_generics(generics, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi), codemap);
			
			
		}
		_ => ()
	}
}

pub fn traverse_module(module: &ast::Mod, codemap: &CodeMap, public: bool) {
	for _view_item in module.view_items.iter() {
		traverse_view_item(_view_item, codemap);
	}
	
	for _item in module.items.iter() {
		traverse_item(_item.deref(), codemap, public);
	}
}

pub fn traverse_foreign_module(module: &ast::ForeignMod, codemap: &CodeMap, public: bool) {
	for _view_item in module.view_items.iter() {
		traverse_view_item(_view_item, codemap);
	}
	
	for _item in module.items.iter() {
		traverse_foreign_item(_item.deref(), codemap, public);
	}
}

pub fn traverse_foreign_item(item: &ast::ForeignItem, codemap: &CodeMap, public: bool) {
	// let _ident = get_name(item.ident.name).get();
	
	let item_is_public = match item.vis {
		ast::Public => true,
		_ => false
	};
	
	// Do not expand this AST node if the public flag is set and this item is not public, or doesn't inherit public visibility
	if public && !item_is_public {
		return
	}
	
	// TODO Flag to control traversal based on visibility
	let vis = match item.vis {
		ast::Public => "public".to_string(),
		_ => "".to_string()
	};
	
	match item.node {
		ast::ForeignItemFn(ref f, ref generics) => {
			let _ty = codemap.span_to_snippet(f.output.span);
			
			let _tyStr = match _ty {
				Some(a) => a.to_owned(),
				None => "".to_string()
			};
			
			
			
			for a in f.inputs.iter() {
				traverse_arg(a, codemap);
			}		
			
			
		},
		// TODO foreign_item_static
		_ => ()
	}
}

pub fn traverse_trait(generics: &ast::Generics, trait_refs: &Vec<ast::TraitRef>, trait_methods: &Vec<ast::TraitMethod>, codemap: &CodeMap) {
	for tm in trait_methods.iter() {
		traverse_trait_method(tm, codemap);
	}
}

pub fn traverse_trait_method(_trait_method: &ast::TraitMethod, codemap: &CodeMap) {
	match *_trait_method {
		ast::Required(ref type_method) => {
			let _ty = codemap.span_to_snippet(type_method.decl.output.span);
			
			let _tyStr = match _ty {
				Some(a) => a.to_owned(),
				None => "".to_string()
			};
			
			
			
			for a in type_method.decl.inputs.iter() {
				traverse_arg(a, codemap);
			}
			
			
		},
		_ => ()
		// TODO Provided method
	}
}

pub fn traverse_method(method: &ast::Method, codemap: &CodeMap) {
	
	match (method.node) {
		ast::MethDecl(ref ident, ref generics, ref abi, ref explicit_self, ref fn_style, ref fn_decl, ref block, ref vis) => {
			for a in fn_decl.inputs.iter() {
				traverse_arg(a, codemap);
			}
		},
		_ => {}
	}
}

pub fn traverse_arg(arg: &ast::Arg, codemap: &CodeMap) {
	let pat = match codemap.span_to_snippet(arg.pat.span) {
		Some(ref snippet) => snippet.to_owned(),
		None => "".to_string()
	};
	let _ty = match codemap.span_to_snippet(arg.ty.span) {
		Some(ref snippet) => snippet.to_owned(),
		None => "".to_string()
	};
	
	
	
}

pub fn traverse_enum(enumeration: &ast::EnumDef, codemap: &CodeMap) {
	for variant in enumeration.variants.iter() {
		// let _ident = get_name(variant.node.name.name).get();
		
		
		
	}
}

pub fn traverse_struct_field(field: &ast::StructField, codemap: &CodeMap) {
	let mut ident: String = "".to_string();
	let mut vis: String = "public".to_string();
	
	match field.node.kind {
		ast::NamedField(ref i, ref v) => {
			ident = get_name(i.name).get().to_owned();
			vis = match *v {
				ast::Public => "public".to_string(),
				_ => "".to_string()
			};
		},
		ast::UnnamedField(_) => ()
	}
	
	let _ty = codemap.span_to_snippet(field.node.ty.span);
	
	let _tyStr = match _ty {
		Some(a) => a.to_owned(),
		None => "".to_string()
	};
	
	
	
}

pub fn traverse_generics(generics: &ast::Generics, startLoc: Loc, endLoc: Loc, codemap: &CodeMap) {
	for param in generics.ty_params.iter() {
		// let ident = get_name(param.ident.name).get();
		
		traverse_param_bounds(&param.bounds, codemap);
		
	}
}

pub fn traverse_param_bounds(bounds: &OwnedSlice<ast::TyParamBound>, codemap: &CodeMap) {
	for bound in bounds.iter() {
		traverse_param_bound(bound, codemap);
	}
}

pub fn traverse_param_bound(bound: &ast::TyParamBound, codemap: &CodeMap) {
	match *bound {
		ast::TraitTyParamBound(ref trait_ref) => {
			let t = codemap.span_to_snippet(trait_ref.path.span).unwrap();
			
			
		},
		ast::OtherRegionTyParamBound(_) => (),
		_ => {}
	}
}