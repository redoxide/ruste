/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class de_redoxi_ruste_core_parser_NativeParser */

#ifndef _Included_de_redoxi_ruste_core_parser_NativeParser
#define _Included_de_redoxi_ruste_core_parser_NativeParser
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     de_redoxi_ruste_core_parser_NativeParser
 * Method:    parseSource
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_de_redoxi_ruste_core_parser_NativeParser_parseSource
  (JNIEnv *, jobject, jstring, jstring);

#ifdef __cplusplus
}
#endif

extern void parseSource(const char *name, jsize nNameChars, const char *source, jsize nSourceChars);
#endif
