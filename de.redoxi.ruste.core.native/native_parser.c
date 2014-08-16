/*
 * native_parser.c
 *
 *  Created on: 9/08/2014
 *      Author: Hayden Smith
 */

#include <dlfcn.h>
#include <stdio.h>
#include <sys/param.h>
#include <unistd.h>
#include <fcntl.h>

#include "de_redoxi_ruste_core_parser_NativeParser.h"

typedef void (*lib_func)();

/*
 * Called by the NativeParser class to parse the source given in the string
 */
JNIEXPORT void JNICALL Java_de_redoxi_ruste_core_parser_NativeParser_parseSource(JNIEnv *env, jobject obj, jstring name, jstring source) {
	jboolean source_is_copy;
	jboolean name_is_copy;

	const char *name_chars = (*env)->GetStringUTFChars(env, source, &name_is_copy);
	jsize num_name_chars = (*env)->GetStringUTFLength(env, source);

	const char *source_chars = (*env)->GetStringUTFChars(env, source, &source_is_copy);
	jsize num_source_chars = (*env)->GetStringUTFLength(env, source);

	void *rust_parser_handle = dlopen("librustparser.dylib", RTLD_NOW | RTLD_GLOBAL);

	char cwd_path[MAXPATHLEN];
	getcwd(&cwd_path[0], MAXPATHLEN);

	if (rust_parser_handle != NULL) {
		printf("Loaded librustparser.dylib\n");
		fflush(stdout);

		lib_func parse_source_fn = dlsym(rust_parser_handle, "parse_source");

		if (parse_source_fn != NULL) {
			parse_source_fn(name_chars, num_name_chars, source_chars, num_source_chars);
		} else {
			printf("Unable to get parse_source handle: %s\n", dlerror());
		}

		dlclose(rust_parser_handle);
	} else {
		printf("Unable to load librustparser.dylib (%s): %s\n", &cwd_path[0], dlerror());
		fflush(stdout);
	}

	(*env)->ReleaseStringUTFChars(env, name, name_chars);
	(*env)->ReleaseStringUTFChars(env, source, source_chars);
}
