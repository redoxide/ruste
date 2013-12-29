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

pub mod module {
	pub struct Structure { 
		x : int, 
		y : float 
	}
	
	pub trait Trait {
		fn voidTraitMethodNoArgs();
		
		fn intTraitMethodFloatArg(&self, i : float) -> int;
	}
	
	impl Trait for Structure {
		
		priv fn privVoidTraitMethodNoArgs() {
			// Do nothing
		}
		
		fn voidTraitMethodNoArgs() {
			// Do nothing
		}
		
		fn intTraitMethodFloatArg(&self, i : float) -> int {
			if i > 0.5 {
				1
			} else {
				0
			}
		}
	}
}

pub enum Enumeration {
	Variant0(float),
	Variant1(int)
}

pub fn voidFunction() {
	// Do nothing
}

pub fn intFunction() -> int {
	2
}