Ruste Rust Development Tools for Eclipse
========================================

Building
--------

Please note that this is a very early release and relies on some additional
utilities compiled from Rust source. It assumes that **Rust 0.9 pre** is installed 
and that `rustc` and `rustpkg` are installed at `/usr/local/bin/`.

1. Install [Rust 0.9 pre](https://github.com/mozilla/rust).

2. Compile `xmlast` in `de.redoxi.ruste.core/src/rust/xmlast.rs`:

		rustc de.redoxi.rust.core/src/rust/xmlast.rs -o de.redoxi.ruste.core/bin/xmlast
    
   (The `xmlast` utility takes Rust source on the standard input and produces an XML formatted
   abstract syntax tree on the standard output, and any compile errors on the standard error output)

3. Import the `de.redoxi.ruste` projects into the Eclipse workspace.

4. Add `eclipse.target` in `de.redoxi.ruste.core.tests` as the Target definition in the "Plug-in development" 
   preferences.

Icons
-----

This feature uses icons from Mark James' Silk icon set (http://www.famfamfam.com/lab/icons/silk/).