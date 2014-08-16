#![crate_name="rustparser"]
#![crate_type="dylib"]

extern crate libc;

use std::rt;
use std::c_str::CString;
use std::io::{File, Read, Open, IoResult};

use jni::{jsize, jchar, JNIEnv, jobject, jstring, jboolean};

mod parser;
mod jni;

#[no_mangle]
#[allow(non_snake_case_functions)]
pub extern "C" fn Java_de_redoxi_ruste_core_parser_NativeParser_parseSource(env: *mut JNIEnv, obj: jobject, name: jstring, source: jstring) {
	let args: u8 = 0;
	let args_ptr: *const u8 = &args;
	rt::init(0, &args_ptr);
	
	let get_string_chars = unsafe { (*env).GetStringUTFChars };
	let get_string_length = unsafe { (*env).GetStringUTFLength };
	
	let num_name_chars: jsize = get_string_length(env, name);
	let num_source_chars: jsize = get_string_length(env, source);
	
	let mut name_is_copy: jboolean = 0 as jboolean;
	let mut source_is_copy: jboolean = 0 as jboolean;
	
	let name_chars: *const i8 = get_string_chars(env, name, &mut name_is_copy) as *const i8;
	let source_chars: *const i8 = get_string_chars(env, source, &mut source_is_copy) as *const i8;
	
	// Create a new CString. Memory is owned by the JNIEnv, so passing false
	let name: CString = unsafe { CString::new(name_chars, false) };
	let source: CString = unsafe { CString::new(source_chars, false) };
	
	let parser: parser::Parser = parser::Parser { env: env, obj: obj };
	
	let name_str: Option<&str> = name.as_str();
	let source_str: Option<&str> = source.as_str();
	
	if name_str.is_some() && source_str.is_some() {
		parser.parse_crate(name_str.unwrap(), source_str.unwrap(), true, true);
	} else {
		// TODO Error
	}
	
	unsafe { 
		rt::cleanup();
	}
}