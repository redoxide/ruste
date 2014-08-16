/*
 * Copyright 2013 Hayden Smith
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under 
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language governing permissions and 
 * limitations under the License.
 */

/*!

Generates an abstract syntax tree for the publicly visible items within the given source crate

*/       
#[feature(managed_boxes)];

extern mod rustc;
extern mod syntax;

use syntax::parse::{new_parse_sess, parse_crate_from_source_str, ParseSess};

use std::io;
use std::fmt;
use std::os;
use std::option;
use std::path;
use std::str;

use syntax::ast;

mod xml {
	use syntax::ast;
	use syntax::codemap::{CodeMap, Loc, CharPos};
	use std::io;
	use std::option;
	use std::fmt;
	use std::str;
	use std::char;

	pub struct XmlWriter {
		writer: @mut io::Writer,
		indentation: uint
	}
	
	fn char_pos_to_col(charPos: CharPos) -> uint {
		match charPos {
			CharPos(pos) =>  { return pos; }
		}
	}

	impl XmlWriter {
		pub fn start(&self) {
			writeln!(self.writer, "<?xml version=\"1.0\" encoding=\"utf-8\"?>");
		}
		
		pub fn end(&self) {
			self.writer.flush();
		}
		
		fn write_indentation(&self) {
			for i in range(0, self.indentation) {
				write!(self.writer, "\t");
			}
		}
		
		fn xml_attr(&self, attr: &str) -> ~str {
			let mut encoded_attr = str::with_capacity(attr.char_len());
			
			for char in attr.iter() {
				match char {
					'<' => { encoded_attr.push_str("&lt;"); },
					'>' => { encoded_attr.push_str("&gt;"); },
					'&' => { encoded_attr.push_str("&amp;"); },
					'"' => { encoded_attr.push_str("&quot;"); },
					_ => { encoded_attr.push_char(char); }
				}
			}
			
			encoded_attr
		}
	
		pub fn start_crate(&mut self, ident: &str, startLoc: Loc, endLoc: Loc) {
			// TODO path
			self.write_indentation();
			writeln!(self.writer, "<crate xmlns=\"https://github.com/redoxide/ruste\" name=\"{name}\" startLine=\"{startLine}\" startPos=\"{startPos}\" endLine=\"{endLine}\" endPos=\"{endPos}\">", name = ident, startLine = startLoc.line, startPos = char_pos_to_col(startLoc.col), endLine = endLoc.line, endPos = char_pos_to_col(endLoc.col));
			self.indentation += 1;
		}
		
		pub fn end_crate(&mut self) {
			self.indentation -= 1;
			self.write_indentation();
			writeln!(self.writer, "</crate>");
		}
		
		pub fn start_module(&mut self, ident: &str, vis: &str, path: &str, startLoc: Loc, endLoc: Loc) {
			self.write_indentation();
			// TODO source path
			writeln!(self.writer, "<module vis=\"{vis}\" path=\"{path}\" ident=\"{ident}\" startLine=\"{startLine}\" startPos=\"{startPos}\" endLine=\"{endLine}\" endPos=\"{endPos}\">", vis = vis, path = path, ident = ident, startLine = startLoc.line, startPos = char_pos_to_col(startLoc.col), endLine = endLoc.line, endPos = char_pos_to_col(endLoc.col));
			self.indentation += 1;
		}
		
		pub fn end_module(&mut self) {
			self.indentation -= 1;
			self.write_indentation();
			writeln!(self.writer, "</module>");
		}
		
		pub fn start_trait(&mut self, ident: &str, vis: &str, startLoc: Loc, endLoc: Loc) {
			self.write_indentation();
			writeln!(self.writer, "<trait vis=\"{vis}\" ident=\"{ident}\" startLine=\"{startLine}\" startPos=\"{startPos}\" endLine=\"{endLine}\" endPos=\"{endPos}\">", vis = vis, ident = ident, startLine = startLoc.line, startPos = char_pos_to_col(startLoc.col), endLine = endLoc.line, endPos = char_pos_to_col(endLoc.col));
			self.indentation += 1;
		}
		
		pub fn end_trait(&mut self) {
			self.indentation -= 1;
			self.write_indentation();
			writeln!(self.writer, "</trait>");
		}
		
		pub fn start_trait_method(&mut self, ident: &str, ty: &str, startLoc: Loc, endLoc: Loc) {
			self.write_indentation();
			writeln!(self.writer, "<traitMethod ident=\"{ident}\" returns=\"{ty}\" startLine=\"{startLine}\" startPos=\"{startPos}\" endLine=\"{endLine}\" endPos=\"{endPos}\">", ident = ident, ty = self.xml_attr(ty), startLine = startLoc.line, startPos = char_pos_to_col(startLoc.col), endLine = endLoc.line, endPos = char_pos_to_col(endLoc.col));
			self.indentation += 1;
		}
		
		pub fn end_trait_method(&mut self) {
			self.indentation -= 1;
			self.write_indentation();
			writeln!(self.writer, "</traitMethod>");
		}
		
		pub fn start_structure(&mut self, ident: &str, vis: &str, startLoc: Loc, endLoc: Loc) {
			self.write_indentation();
			writeln!(self.writer, "<structure vis=\"{vis}\" ident=\"{ident}\" startLine=\"{startLine}\" startPos=\"{startPos}\" endLine=\"{endLine}\" endPos=\"{endPos}\">", vis = vis, ident = ident, startLine = startLoc.line, startPos = char_pos_to_col(startLoc.col), endLine = endLoc.line, endPos = char_pos_to_col(endLoc.col));
			self.indentation += 1;
		}
		
		pub fn end_structure(&mut self) {
			self.indentation -= 1;
			self.write_indentation();
			writeln!(self.writer, "</structure>");
		}
		
		pub fn start_enumeration(&mut self, ident: &str, vis: &str, startLoc: Loc, endLoc: Loc) {
			self.write_indentation();
			writeln!(self.writer, "<enumeration vis=\"{vis}\" ident=\"{ident}\" startLine=\"{startLine}\" startPos=\"{startPos}\" endLine=\"{endLine}\" endPos=\"{endPos}\">", vis = vis, ident = ident, startLine = startLoc.line, startPos = char_pos_to_col(startLoc.col), endLine = endLoc.line, endPos = char_pos_to_col(endLoc.col));
			self.indentation += 1;
		}
		
		pub fn end_enumeration(&mut self) {
			self.indentation -= 1;
			self.write_indentation();
			writeln!(self.writer, "</enumeration>");
		}
		
		pub fn start_enumeration_variant(&mut self, ident: &str, startLoc: Loc, endLoc: Loc) {
			self.write_indentation();
			writeln!(self.writer, "<variant ident=\"{ident}\" startLine=\"{startLine}\" startPos=\"{startPos}\" endLine=\"{endLine}\" endPos=\"{endPos}\">", ident = ident, startLine = startLoc.line, startPos = char_pos_to_col(startLoc.col), endLine = endLoc.line, endPos = char_pos_to_col(endLoc.col));
			self.indentation += 1;
		}
		
		pub fn end_enumeration_variant(&mut self) {
			self.indentation -= 1;
			self.write_indentation();
			writeln!(self.writer, "</variant>");
		} 
		
		pub fn start_argument(&mut self, pat: &str, ty: &str, startLoc: Loc, endLoc: Loc) {
			self.write_indentation();
			writeln!(self.writer, "<arg pat=\"{pat}\" type=\"{ty}\" startLine=\"{startLine}\" startPos=\"{startPos}\" endLine=\"{endLine}\" endPos=\"{endPos}\">", pat = self.xml_attr(pat), ty = self.xml_attr(ty), startLine = startLoc.line, startPos = char_pos_to_col(startLoc.col), endLine = endLoc.line, endPos = char_pos_to_col(endLoc.col));
			self.indentation += 1;
		}
		
		pub fn end_argument(&mut self) {
			self.indentation -= 1;
			self.write_indentation();
			writeln!(self.writer, "</arg>");
		}
		
		pub fn start_function(&mut self, ident: &str, ty: &str, vis: &str, startLoc: Loc, endLoc: Loc) {
			self.write_indentation();
			writeln!(self.writer, "<function vis=\"{vis}\" ident=\"{ident}\" returns=\"{ty}\" startLine=\"{startLine}\" startPos=\"{startPos}\" endLine=\"{endLine}\" endPos=\"{endPos}\">", vis = vis, ident = ident, ty = self.xml_attr(ty), startLine = startLoc.line, startPos = char_pos_to_col(startLoc.col), endLine = endLoc.line, endPos = char_pos_to_col(endLoc.col));
			self.indentation += 1;
		}
		
		pub fn end_function(&mut self) {
			self.indentation -= 1;
			self.write_indentation();
			writeln!(self.writer, "</function>");
		}
		
		pub fn start_implementation(&mut self, implForType: &str, implTrait: &str, startLoc: Loc, endLoc: Loc) {
			self.write_indentation();
			writeln!(self.writer, "<implementation type=\"{implForType}\" trait=\"{implTrait}\" startLine=\"{startLine}\" startPos=\"{startPos}\" endLine=\"{endLine}\" endPos=\"{endPos}\">", implForType = implForType, implTrait = implTrait, startLine = startLoc.line, startPos = char_pos_to_col(startLoc.col), endLine = endLoc.line, endPos = char_pos_to_col(endLoc.col));
			self.indentation += 1;
		}
		
		pub fn end_implementation(&mut self) {
			self.indentation -= 1;
			self.write_indentation();
			writeln!(self.writer, "</implementation>");
		}
		
		pub fn start_implementation_method(&mut self, ident: &str, ty: &str, vis: &str, startLoc: Loc, endLoc: Loc) {
			self.write_indentation();
			writeln!(self.writer, "<implementationMethod ident=\"{ident}\" returns=\"{ty}\" startLine=\"{startLine}\" startPos=\"{startPos}\" endLine=\"{endLine}\" endPos=\"{endPos}\">", ident = ident, ty = self.xml_attr(ty), startLine = startLoc.line, startPos = char_pos_to_col(startLoc.col), endLine = endLoc.line, endPos = char_pos_to_col(endLoc.col));
			self.indentation += 1;
		}
		
		pub fn end_implementation_method(&mut self) {
			self.indentation -= 1;
			self.write_indentation();
			writeln!(self.writer, "</implementationMethod>");
		}
		
		pub fn start_structure_field(&mut self, ident: &str, ty: &str, vis: &str, startLoc: Loc, endLoc: Loc) {
			self.write_indentation();
			writeln!(self.writer, "<field ident=\"{ident}\" type=\"{ty}\" startLine=\"{startLine}\" startPos=\"{startPos}\" endLine=\"{endLine}\" endPos=\"{endPos}\">", ident = ident, ty = self.xml_attr(ty), startLine = startLoc.line, startPos = char_pos_to_col(startLoc.col), endLine = endLoc.line, endPos = char_pos_to_col(endLoc.col));
			self.indentation += 1;
		}
		
		pub fn end_structure_field(&mut self) {
			self.indentation -= 1;
			self.write_indentation();
			writeln!(self.writer, "</field>");
		}
		
		pub fn start_generic_param(&mut self, ident: &str, startLoc: Loc, endLoc: Loc) {
			self.write_indentation();
			writeln!(self.writer, "<genericParameter ident=\"{ident}\" startLine=\"{startLine}\" startPos=\"{startPos}\" endLine=\"{endLine}\" endPos=\"{endPos}\">", ident = ident, startLine = startLoc.line, startPos = char_pos_to_col(startLoc.col), endLine = endLoc.line, endPos = char_pos_to_col(endLoc.col));
			self.indentation += 1;
		}
		
		pub fn end_generic_param(&mut self) {
			self.indentation -= 1;
			self.write_indentation();
			writeln!(self.writer, "</genericParameter>");
		}
		
		pub fn start_param_bound(&mut self, t: &str, startLoc: Loc, endLoc: Loc) {
			self.write_indentation();
			writeln!(self.writer, "<parameterBound trait=\"{t}\" startLine=\"{startLine}\" startPos=\"{startPos}\" endLine=\"{endLine}\" endPos=\"{endPos}\">", t = self.xml_attr(t), startLine = startLoc.line, startPos = char_pos_to_col(startLoc.col), endLine = endLoc.line, endPos = char_pos_to_col(endLoc.col));
			self.indentation += 1;
		}
		
		pub fn end_param_bound(&mut self) {
			self.indentation -= 1;
			self.write_indentation();
			writeln!(self.writer, "</parameterBound>");
		}
		
		pub fn start_type_def(&mut self, ident: &str, ty: &str, vis: &str, startLoc: Loc, endLoc: Loc) {
			self.write_indentation();
			writeln!(self.writer, "<type vis=\"{vis}\" ident=\"{ident}\" type=\"{ty}\" startLine=\"{startLine}\" startPos=\"{startPos}\" endLine=\"{endLine}\" endPos=\"{endPos}\">", ident = ident, ty = ty, startLine = startLoc.line, startPos = char_pos_to_col(startLoc.col), endLine = endLoc.line, endPos = char_pos_to_col(endLoc.col));
			self.indentation += 1;
		}
		
		pub fn end_type_def(&mut self) {
			self.indentation -= 1;
			self.write_indentation();
			writeln!(self.writer, "</type>");
		}
	}
}
       
mod traverse {
	use syntax::ast;
	use syntax::codemap::{CodeMap, Loc};
	use syntax::parse::token::interner_get;
	use syntax::opt_vec;
	
	use std::io;
	
	use xml;

	pub fn traverse_crate(name: &str, crate: &ast::Crate, codemap: &CodeMap, xml_writer: &mut xml::XmlWriter, public: bool) {
		xml_writer.start_crate(name, codemap.lookup_char_pos(crate.span.lo), codemap.lookup_char_pos(crate.span.hi));
		
		traverse_module(&crate.module, codemap, xml_writer, public);
		
		xml_writer.end_crate();
	}
	
	pub fn traverse_view_item(view_item: &ast::view_item, codemap: &CodeMap, xml_writer: &mut xml::XmlWriter) {
		// TODO Create view items
	}
	
	pub fn traverse_item(item: &ast::item, codemap: &CodeMap, xml_writer: &mut xml::XmlWriter, public: bool) {
		let _ident = interner_get(item.ident.name);
		
		let item_is_public = match item.vis {
			ast::public => true,
			_ => false
		};
		
		// Do not expand this AST node if the public flag is set and this item is not public, or doesn't inherit public visibility
		if public && !item_is_public {
			return
		}

		let vis = match item.vis {
			ast::private => ~"private",
			ast::public => ~"public",
			_ => ~""
		};
		
		match item.node {
			ast::item_mod(ref module) => {
				let mut path = ~"";
				
				// Set the path attribute for this module
				for attr in item.attrs.iter() {
					match attr.node.value.node {
						ast::MetaNameValue(ref name, l) if *name == @"path" => { 
							match l.node {
								ast::lit_str(ref path_val, style) => { path = path_val.to_owned(); },
								_ => ()
							} 
						},
						_ => ()
					}
				}
			
				xml_writer.start_module(_ident, vis, path, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi));
				
				traverse_module(module, codemap, xml_writer, public);
				
				xml_writer.end_module();
			},
			ast::item_foreign_mod(ref foreign_module) => {
				let mut path = ~"";
				
				// Set the path attribute for this module
				for attr in item.attrs.iter() {
					match attr.node.value.node {
						ast::MetaNameValue(ref name, l) if *name == @"path" => { 
							match l.node {
								ast::lit_str(ref path_val, style) => { path = path_val.to_owned(); },
								_ => ()
							} 
						},
						_ => ()
					}
				}
			
				xml_writer.start_module(_ident, vis, path, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi));
				
				traverse_foreign_module(foreign_module, codemap, xml_writer, public);
				
				xml_writer.end_module();
			},
			ast::item_fn(ref f, ref pur, ref abi, ref generics, ref block) => {
				let _ty = codemap.span_to_snippet(f.output.span);
				
				let _tyStr = match _ty {
					Some(a) => a.to_owned(),
					None => ~""
				};
				
				xml_writer.start_function(_ident, _tyStr, vis, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi));
				
				traverse_generics(generics, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi), codemap, xml_writer);
				
				for a in f.inputs.iter() {
					traverse_arg(a, codemap, xml_writer);
				}		
				
				// TODO Collect references within function
				
				xml_writer.end_function();
			},
			ast::item_struct(ref s, ref generics) => {
				xml_writer.start_structure(_ident, vis, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi));
				
				traverse_generics(generics, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi), codemap, xml_writer);
				
				for f in s.fields.iter() {
					traverse_struct_field(*f, codemap, xml_writer);
				}
				
				xml_writer.end_structure();
			},
			ast::item_trait(ref generics, ref trait_refs, ref trait_methods) => {
				xml_writer.start_trait(_ident, vis, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi));
				traverse_generics(generics, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi), codemap, xml_writer);
				traverse_trait(generics, trait_refs, trait_methods, codemap, xml_writer);
				xml_writer.end_trait();
			},
			ast::item_enum(ref e, ref generics) => {
				xml_writer.start_enumeration(_ident, vis, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi));
				traverse_generics(generics, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi), codemap, xml_writer);
				traverse_enum(e, codemap, xml_writer);
				xml_writer.end_enumeration();
			},
			ast::item_impl(ref generics, ref optional_trait_ref, ref ty, ref methods) => {
				traverse_generics(generics, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi), codemap, xml_writer);
				
				// TODO Map crate to resolve trait name
				let opt_trait = match *optional_trait_ref {
					Some(ref t) => ~"",
					None => ~""
				};
				
				let _ty = codemap.span_to_snippet(ty.span);
				
				let _tyStr = match _ty {
					Some(s) => s.to_owned(),
					None => ~""
				};
				
				xml_writer.start_implementation(_tyStr, opt_trait, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi));
				
				for _method in methods.iter() {
					traverse_method(*_method, codemap, xml_writer);
				}
				
				xml_writer.end_implementation();
			},
			ast::item_ty(ref ty, ref generics) => {
				let _ty = codemap.span_to_snippet(ty.span);
				
				let _tyStr = match _ty {
					Some(s) => s.to_owned(),
					None => ~""
				};
				
				xml_writer.start_type_def(_ident, _tyStr, vis, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi));
				
				traverse_generics(generics, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi), codemap, xml_writer);
				
				xml_writer.end_type_def();
			}
			_ => ()
		}
	}
	
	pub fn traverse_module(module: &ast::_mod, codemap: &CodeMap, xml_writer: &mut xml::XmlWriter, public: bool) {
		for _view_item in module.view_items.iter() {
			traverse_view_item(_view_item, codemap, xml_writer);
		}
		
		for _item in module.items.iter() {
			traverse_item(*_item, codemap, xml_writer, public);
		}
	}
	
	pub fn traverse_foreign_module(module: &ast::foreign_mod, codemap: &CodeMap, xml_writer: &mut xml::XmlWriter, public: bool) {
		for _view_item in module.view_items.iter() {
			traverse_view_item(_view_item, codemap, xml_writer);
		}
		
		for _item in module.items.iter() {
			traverse_foreign_item(*_item, codemap, xml_writer, public);
		}
	}
	
	pub fn traverse_foreign_item(item: &ast::foreign_item, codemap: &CodeMap, xml_writer: &mut xml::XmlWriter, public: bool) {
		let _ident = interner_get(item.ident.name);
		
		let item_is_public = match item.vis {
			ast::public => true,
			_ => false
		};
		
		// Do not expand this AST node if the public flag is set and this item is not public, or doesn't inherit public visibility
		if public && !item_is_public {
			return
		}
		
		// TODO Flag to control traversal based on visibility
		let vis = match item.vis {
			ast::private => ~"private",
			ast::public => ~"public",
			_ => ~""
		};
		
		match item.node {
			ast::foreign_item_fn(ref f, ref generics) => {
				let _ty = codemap.span_to_snippet(f.output.span);
				
				let _tyStr = match _ty {
					Some(a) => a.to_owned(),
					None => ~""
				};
				
				xml_writer.start_function(_ident, _tyStr, vis, codemap.lookup_char_pos(item.span.lo), codemap.lookup_char_pos(item.span.hi));
				
				for a in f.inputs.iter() {
					traverse_arg(a, codemap, xml_writer);
				}		
				
				xml_writer.end_function();
			},
			// TODO foreign_item_static
			_ => ()
		}
	}
	
	pub fn traverse_trait(generics: &ast::Generics, trait_refs: &~[ast::trait_ref], trait_methods: &~[ast::trait_method], codemap: &CodeMap, xml_writer: &mut xml::XmlWriter) {
		for tm in trait_methods.iter() {
			traverse_trait_method(tm, codemap, xml_writer);
		}
	}
	
	pub fn traverse_trait_method(_trait_method: &ast::trait_method, codemap: &CodeMap, xml_writer: &mut xml::XmlWriter) {
		match *_trait_method {
			ast::required(ref typeMethod) => {
				let _ty = codemap.span_to_snippet(typeMethod.decl.output.span);
				
				let _tyStr = match _ty {
					Some(a) => a.to_owned(),
					None => ~""
				};
				
				xml_writer.start_trait_method(interner_get(typeMethod.ident.name), _tyStr,  codemap.lookup_char_pos(typeMethod.span.lo), codemap.lookup_char_pos(typeMethod.span.hi));
				
				for a in typeMethod.decl.inputs.iter() {
					traverse_arg(a, codemap, xml_writer);
				}
				
				xml_writer.end_trait_method();
			},
			_ => ()
			// TODO Provided method
		}
	}
	
	pub fn traverse_method(_method: &ast::method, codemap: &CodeMap, xml_writer: &mut xml::XmlWriter) {
		let vis = match _method.vis {
			ast::private => ~"private",
			ast::public => ~"public",
			_ => ~""
		};
		
		let _ty = codemap.span_to_snippet(_method.decl.output.span);
		
		let _tyStr = match _ty {
			Some(a) => a.to_owned(),
			None => ~""
		};
		
		xml_writer.start_implementation_method(interner_get(_method.ident.name), _tyStr, vis, codemap.lookup_char_pos(_method.span.lo), codemap.lookup_char_pos(_method.span.hi));
		
		for a in _method.decl.inputs.iter() {
			traverse_arg(a, codemap, xml_writer);
		}
		
		xml_writer.end_implementation_method();
	}
	
	pub fn traverse_arg(arg: &ast::arg, codemap: &CodeMap, xml_writer: &mut xml::XmlWriter) {
		let pat = match codemap.span_to_snippet(arg.pat.span) {
			Some(ref snippet) => snippet.to_owned(),
			None => ~""
		};
		let _ty = match codemap.span_to_snippet(arg.ty.span) {
			Some(ref snippet) => snippet.to_owned(),
			None => ~""
		};
		
		xml_writer.start_argument(pat, _ty, codemap.lookup_char_pos(arg.pat.span.lo), codemap.lookup_char_pos(arg.ty.span.hi));
		xml_writer.end_argument();
	}
	
	pub fn traverse_enum(enumeration: &ast::enum_def, codemap: &CodeMap, xml_writer: &mut xml::XmlWriter) {
		for variant in enumeration.variants.iter() {
			let _ident = interner_get(variant.node.name.name);
			
			xml_writer.start_enumeration_variant(_ident, codemap.lookup_char_pos(variant.span.lo), codemap.lookup_char_pos(variant.span.hi));
			xml_writer.end_enumeration_variant();
		}
	}
	
	pub fn traverse_struct_field(field: &ast::struct_field, codemap: &CodeMap, xml_writer: &mut xml::XmlWriter) {
		let mut ident : ~str = ~"";
		let mut vis : ~str = ~"public";
		
		match field.node.kind {
			ast::named_field(ref i, ref v) => {
				ident = interner_get(i.name).to_owned();
				vis = match *v {
					ast::private => ~"private",
					ast::public => ~"public",
					_ => ~""
				};
			},
			ast::unnamed_field => ()
		}
		
		let _ty = codemap.span_to_snippet(field.node.ty.span);
		
		let _tyStr = match _ty {
			Some(a) => a.to_owned(),
			None => ~""
		};
		
		xml_writer.start_structure_field(ident, _tyStr, vis, codemap.lookup_char_pos(field.span.lo), codemap.lookup_char_pos(field.span.hi));
		xml_writer.end_structure_field();
	}
	
	pub fn traverse_generics(generics: &ast::Generics, startLoc: Loc, endLoc: Loc, codemap: &CodeMap, xml_writer: &mut xml::XmlWriter) {
		for param in generics.ty_params.iter() {
			let ident = interner_get(param.ident.name);
			xml_writer.start_generic_param(ident, startLoc, endLoc);
			traverse_param_bounds(&param.bounds, codemap, xml_writer);
			xml_writer.end_generic_param();
		}
	}
	
	pub fn traverse_param_bounds(bounds: &opt_vec::OptVec<ast::TyParamBound>, codemap: &CodeMap, xml_writer: &mut xml::XmlWriter) {
		for bound in bounds.iter() {
			traverse_param_bound(bound, codemap, xml_writer);
		}
	}
	
	pub fn traverse_param_bound(bound: &ast::TyParamBound, codemap: &CodeMap, xml_writer: &mut xml::XmlWriter) {
		match *bound {
			ast::TraitTyParamBound(ref trait_ref) => {
				let t = codemap.span_to_snippet(trait_ref.path.span).unwrap();
				xml_writer.start_param_bound(t, codemap.lookup_char_pos(trait_ref.path.span.lo), codemap.lookup_char_pos(trait_ref.path.span.hi));
				xml_writer.end_param_bound();
			},
			ast::RegionTyParamBound => ()
		}
	}
}

fn parse_source(name: &str, source: &str, xml_writer: &mut xml::XmlWriter, expand: bool, public: bool) {
	// TODO use diagnostic emitter?
	let parse_session = new_parse_sess(option::None);
	let cfg: ast::CrateConfig = ~[];
	
	let mut crate = parse_crate_from_source_str(name.to_managed(), source.to_managed(), cfg.clone(), parse_session);
	
	// Expand module definitions
	if expand {
		crate = syntax::ext::expand::expand_crate(parse_session, cfg.clone(), crate);
	}
	
	// Need to assign node IDs then map the crate?
	
	xml_writer.start();
	traverse::traverse_crate(name, &crate, &*parse_session.cm, xml_writer, public);
	xml_writer.end();
}

fn main() {
	let args = os::args();
	
	let name = args[1].clone();
	
	let expand = is_expand_configured(args);
	let public = is_public_only(args);
	
	let writer = io::stdio::stdout();
	let mut xml_writer = xml::XmlWriter { writer: @mut writer as @mut io::Writer, indentation: 0 };
	
	let source_str = str::from_utf8(io::stdio::stdin().read_to_end());
	
	parse_source(name, source_str.to_managed(), &mut xml_writer, expand, public);
}

fn is_expand_configured(args: &[~str]) -> bool {
	for arg in args.iter() {
		if *arg == ~"--expand" {
			return true
		}
	}
	
	false
}

fn is_public_only(args: &[~str]) -> bool {
	for arg in args.iter() {
		if *arg == ~"--public" {
			return true
		}
	}
	
	false
}
