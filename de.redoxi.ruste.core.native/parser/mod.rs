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
       
#![feature(managed_boxes)]

extern crate rustc;
extern crate syntax;
extern crate libc;

use self::syntax::parse::{new_parse_sess_special_handler, parse_crate_from_source_str, ParseSess};
use self::syntax::diagnostic::{mk_span_handler, mk_handler, Emitter, RenderSpan, Level};
use self::syntax::codemap::{CodeMap, Span};
use std::c_str::CString;
use self::syntax::ast;

use std::io;
use std::fmt;
use std::os;
use std::option;
use std::path;
use std::str;
use std::vec::Vec;
use std::kinds::Send;

use jni::{JNIEnv, jobject};

mod traverse;
#[path = "../jni.rs"]
mod jni;

pub struct Parser {
	// JNIEnv pointer
	pub env: *mut JNIEnv,
	
	// Access to NativeParser Java object
	pub obj: jobject
}

impl Parser {
	pub fn parse_crate(&self, name: &str, source: &str, expand: bool, public: bool) {
		// TODO use diagnostic emitter?
		let parse_session = new_parse_sess_special_handler(mk_span_handler(mk_handler(box *self), CodeMap::new()));
		let cfg: ast::CrateConfig = Vec::new();
		
		let mut c = parse_crate_from_source_str(String::from_str(name), String::from_str(source), cfg.clone(), &parse_session);
		
		// Expand module definitions
		// if expand {
		// 	c = syntax::ext::expand::expand_crate(parse_session, cfg.clone(), c);
		// }
		
		// Need to assign node IDs then map the crate?
		
		
		traverse::traverse_crate(name, &c, &parse_session.span_diagnostic.cm, public);
	}
}

// TODO This is probably not a good idea
impl Send for Parser {}
impl Emitter for Parser {

	fn emit(&mut self, cmsp: Option<(&CodeMap, Span)>, msg: &str, code: Option<&str>, lvl: Level) {
	
	}
	
	fn custom_emit(&mut self, cm: &CodeMap, sp: RenderSpan, msg: &str, lvl: Level) {
	
	}
}