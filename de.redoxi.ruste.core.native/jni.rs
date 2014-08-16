extern crate libc;

pub type jint 				= libc::c_int;
pub type jlong 				= libc::c_long;
pub type jchar 				= libc::c_uchar;
pub type jboolean 			= libc::c_uchar;
pub type jshort 			= libc::c_short;
pub type jdouble 			= libc::c_double;
pub type jfloat				= libc::c_float;
pub type jbyte				= libc::c_char;

pub type jsize 				= jint;

pub type jthrowable			= jobject;
pub type jarray				= jobject;
pub type jbooleanArray		= jobject;
pub type jbyteArray			= jobject;
pub type jcharArray			= jobject;
pub type jshortArray		= jobject;
pub type jintArray			= jobject;
pub type jlongArray			= jobject;
pub type jfloatArray		= jobject;
pub type jdoubleArray		= jobject;
pub type jobjectArray		= jobject;

struct _jobject;

pub type jobject 	= *mut _jobject;
pub type jclass 	= jobject;
pub type jstring	= jobject; 

pub type void 		= libc::c_void;
pub type char		= libc::c_char;

pub type jweak		= jobject;

// typedef union jvalue {
//     jboolean z;
//     jbyte    b;
//     jchar    c;
//     jshort   s;
//     jint     i;
//     jlong    j;
//     jfloat   f;
//     jdouble  d;
//     jobject  l;
// } jvalue;

pub type jvalue = jlong;

pub enum va_list {}

struct _jfieldID;
struct _jmethodID;

pub type jfieldID 	= _jfieldID;
pub type jmethodID	= _jmethodID;

pub type jobjectRefType = int;
pub static JNIInvalidRefType: int 		= 0;
pub static JNILocalRefType: int 		= 1;
pub static JNIGlobalRefType: int		= 2;
pub static JNIWeakGlobalRefType: int	= 3;

/*
 * jboolean constants
 */

pub static JNI_FALSE: int = 0;
pub static JNI_TRUE: int = 1;

/*
 * possible return values for JNI functions.
 */

pub static JNI_OK: int			= 0;               /* success */
pub static JNI_ERR: int         = -1;              /* unknown error */
pub static JNI_EDETACHED: int   = -2;              /* thread detached from the VM */
pub static JNI_EVERSION: int    = -3;              /* JNI version error */
pub static JNI_ENOMEM: int      = -4;              /* not enough memory */
pub static JNI_EEXIST: int      = -5;              /* VM already created */
pub static JNI_EINVAL: int      = -6;              /* invalid arguments */

/*
 * used in ReleaseScalarArrayElements
 */

pub static JNI_COMMIT: int = 1;
pub static JNI_ABORT: int = 2;

pub struct JNINativeMethod {
    pub name: *mut libc::c_char,
    pub signature: *mut libc::c_char,
    pub fnPtr: *mut libc::c_void
}

/*
 * used in RegisterNatives to describe native method name, signature,
 * and function pointer.
 */

// #[allow(non_snake_case_functions)]
pub struct JNIEnv {
	reserved0 : *const void,
    reserved1 : *const void,
    reserved2 : *const void,
	reserved3 : *const void,
	
	pub GetVersion : extern "C" fn(env : *mut JNIEnv) -> jint,

    pub DefineClass : extern "C" fn(env : *mut JNIEnv, name : *mut char, loader : jobject, buf : *mut jbyte, len : jsize) -> jclass,
    pub FindClass : extern "C" fn(env : *mut JNIEnv, name : *mut char) -> jclass,

    pub FromReflectedMethod : extern "C" fn(env : *mut JNIEnv, method : jobject) -> jmethodID,
    pub FromReflectedField : extern "C" fn(env : *mut JNIEnv, field : jobject) -> jfieldID,

    pub ToReflectedMethod : extern "C" fn(env : *mut JNIEnv, cls : jclass, methodID : jmethodID, isStatic : jboolean) -> jobject,

    pub GetSuperclass : extern "C" fn(env : *mut JNIEnv, sub : jclass) -> jclass,
    pub IsAssignableFrom : extern "C" fn(env : *mut JNIEnv, sub : jclass, sup : jclass) -> jboolean,

    pub ToReflectedField : extern "C" fn(env : *mut JNIEnv, cls : jclass, fieldID : jfieldID, isStatic : jboolean) -> jobject,

    pub Throw : extern "C" fn(env : *mut JNIEnv, obj : jthrowable) -> jint,
    pub ThrowNew : extern "C" fn(env : *mut JNIEnv, clazz : jclass, msg : *mut char) -> jint,
    pub ExceptionOccurred : extern "C" fn(env : *mut JNIEnv) -> jthrowable,
    pub ExceptionDescribe : extern "C" fn(env : *mut JNIEnv) -> void,
    pub ExceptionClear : extern "C" fn(env : *mut JNIEnv) -> void,
    pub FatalError : extern "C" fn(env : *mut JNIEnv, msg : *mut char) -> void,

    pub PushLocalFrame : extern "C" fn(env : *mut JNIEnv, capacity : jint) -> jint,
    pub PopLocalFrame : extern "C" fn(env : *mut JNIEnv, result : jobject) -> jobject,

    pub NewGlobalRef : extern "C" fn(env : *mut JNIEnv, lobj : jobject) -> jobject,
    pub DeleteGlobalRef : extern "C" fn(env : *mut JNIEnv, greference : jobject) -> void,
    pub DeleteLocalRef : extern "C" fn(env : *mut JNIEnv, obj : jobject) -> void,
    pub IsSameObject : extern "C" fn(env : *mut JNIEnv, obj1 : jobject, obj2 : jobject) -> jboolean,
    pub NewLocalRef : extern "C" fn(env : *mut JNIEnv, reference : jobject) -> jobject,
    pub EnsureLocalCapacity : extern "C" fn(env : *mut JNIEnv, capacity : jint) -> jint,

    pub AllocObject : extern "C" fn(env : *mut JNIEnv, clazz : jclass) -> jobject,
    pub NewObject : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, ...) -> jobject,
    pub NewObjectV : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : va_list) -> jobject,
    pub NewObjectA : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jobject,

    pub GetObjectClass : extern "C" fn(env : *mut JNIEnv, obj : jobject) -> jclass,
    pub IsInstanceOf : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass) -> jboolean,

    pub GetMethodID : extern "C" fn(env : *mut JNIEnv, clazz : jclass, name : *mut char, sig : *mut char) -> jmethodID,

    pub CallObjectMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, ...) -> jobject,
    pub CallObjectMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : va_list) -> jobject,
    pub CallObjectMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : *mut jvalue) -> jobject,
    
    pub CallBooleanMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, ...) -> jboolean,
    pub CallBooleanMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : va_list) -> jboolean,
    pub CallBooleanMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : *mut jvalue) -> jboolean,
    
    pub CallByteMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, ...) -> jbyte,
    pub CallByteMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : va_list) -> jbyte,
    pub CallByteMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : *mut jvalue) -> jbyte,

    pub CallCharMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, ...) -> jchar,
    pub CallCharMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : va_list) -> jchar,
    pub CallCharMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : *mut jvalue) -> jchar,

    pub CallShortMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, ...) -> jshort,
    pub CallShortMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : va_list) -> jshort,
    pub CallShortMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : *mut jvalue) -> jshort,

    pub CallIntMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, ...) -> jint,
    pub CallIntMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : va_list) -> jint,
    pub CallIntMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : *mut jvalue) -> jint,

    pub CallLongMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, ...) -> jlong,
    pub CallLongMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : va_list) -> jlong,
    pub CallLongMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : *mut jvalue) -> jlong,

    pub CallFloatMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, ...) -> jfloat,
    pub CallFloatMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : va_list) -> jfloat,
    pub CallFloatMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : *mut jvalue) -> jfloat,

    pub CallDoubleMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, ...) -> jdouble,
    pub CallDoubleMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : va_list) -> jdouble,
    pub CallDoubleMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : *mut jvalue) -> jdouble,

    pub CallVoidMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, ...) -> void,
    pub CallVoidMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : va_list) -> void,
    pub CallVoidMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, methodID : jmethodID, args : *mut jvalue),
    
    pub CallNonvirtualObjectMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, ...) -> jobject,
    pub CallNonvirtualObjectMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : va_list) -> jobject,
    pub CallNonvirtualObjectMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jobject,

    pub CallNonvirtualBooleanMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, ...) -> jboolean,
    pub CallNonvirtualBooleanMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : va_list) -> jboolean,
    pub CallNonvirtualBooleanMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jboolean,

    pub CallNonvirtualByteMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, ...) -> jbyte,
    pub CallNonvirtualByteMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : va_list) -> jbyte,
    pub CallNonvirtualByteMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jbyte,

    pub CallNonvirtualCharMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, ...) -> jchar,
    pub CallNonvirtualCharMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : va_list) -> jchar,
    pub CallNonvirtualCharMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jchar,

    pub CallNonvirtualShortMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, ...) -> jshort,
    pub CallNonvirtualShortMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : va_list) -> jshort,
    pub CallNonvirtualShortMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jshort,

    pub CallNonvirtualIntMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, ...) -> jint,
    pub CallNonvirtualIntMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : va_list) -> jint,
    pub CallNonvirtualIntMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jint,

    pub CallNonvirtualLongMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, ...) -> jlong,
    pub CallNonvirtualLongMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : va_list) -> jlong,
    pub CallNonvirtualLongMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jlong,

    pub CallNonvirtualFloatMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, ...) -> jfloat,
    pub CallNonvirtualFloatMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : va_list) -> jfloat,
    pub CallNonvirtualFloatMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jfloat,

    pub CallNonvirtualDoubleMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, ...) -> jdouble,
    pub CallNonvirtualDoubleMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : va_list) -> jdouble,
    pub CallNonvirtualDoubleMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jdouble,

    pub CallNonvirtualVoidMethod : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, ...) -> void,
    pub CallNonvirtualVoidMethodV : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : va_list) -> void,
    pub CallNonvirtualVoidMethodA : extern "C" fn(env : *mut JNIEnv, obj : jobject, clazz : jclass, methodID : jmethodID, args : *mut jvalue),

    pub GetFieldID : extern "C" fn(env : *mut JNIEnv, clazz : jclass, name : *mut char, sig : *mut char) -> jfieldID,

    pub GetObjectField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID) -> jobject,
    pub GetBooleanField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID) -> jboolean,
    pub GetByteField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID) -> jbyte,
    pub GetCharField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID) -> jchar,
    pub GetShortField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID) -> jshort,
    pub GetIntField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID) -> jint,
    pub GetLongField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID) -> jlong,
    pub GetFloatField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID) -> jfloat,
    pub GetDoubleField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID) -> jdouble,

    pub SetObjectField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID, val : jobject) -> void,
    pub SetBooleanField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID, val : jboolean) -> void,
    pub SetByteField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID, val : jbyte) -> void,
    pub SetCharField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID, val : jchar) -> void,
    pub SetShortField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID, val : jshort) -> void,
    pub SetIntField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID, val : jint) -> void,
    pub SetLongField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID, val : jlong) -> void,
    pub SetFloatField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID, val : jfloat) -> void,
    pub SetDoubleField : extern "C" fn(env : *mut JNIEnv, obj : jobject, fieldID : jfieldID, val : jdouble) -> void,

	pub GetStaticMethodID : extern "C" fn(env : *mut JNIEnv, clazz : jclass, name : *mut char, sig : *mut char) -> jmethodID,
    
    pub CallStaticObjectMethod : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, ...) -> jobject,
    pub CallStaticObjectMethodV : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : va_list) -> jobject,
    pub CallStaticObjectMethodA : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jobject,

    pub CallStaticBooleanMethod : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, ...) -> jboolean,
    pub CallStaticBooleanMethodV : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : va_list) -> jboolean,
    pub CallStaticBooleanMethodA : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jboolean,

    pub CallStaticByteMethod : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, ...) -> jbyte,
    pub CallStaticByteMethodV : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : va_list) -> jbyte,
    pub CallStaticByteMethodA : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jbyte,

    pub CallStaticCharMethod : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, ...) -> jchar,
    pub CallStaticCharMethodV : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : va_list) -> jchar,
    pub CallStaticCharMethodA : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jchar,

    pub CallStaticShortMethod : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, ...) -> jshort,
    pub CallStaticShortMethodV : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : va_list) -> jshort,
    pub CallStaticShortMethodA : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jshort,

    pub CallStaticIntMethod : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, ...) -> jint,
    pub CallStaticIntMethodV : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : va_list) -> jint,
    pub CallStaticIntMethodA : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jint,

    pub CallStaticLongMethod : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, ...) -> jlong,
    pub CallStaticLongMethodV : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : va_list) -> jlong,
    pub CallStaticLongMethodA : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jlong,

    pub CallStaticFloatMethod : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, ...) -> jfloat,
    pub CallStaticFloatMethodV : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : va_list) -> jfloat,
    pub CallStaticFloatMethodA : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jfloat,

    pub CallStaticDoubleMethod : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, ...) -> jdouble,
    pub CallStaticDoubleMethodV : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : va_list) -> jdouble,
    pub CallStaticDoubleMethodA : extern "C" fn(env : *mut JNIEnv, clazz : jclass, methodID : jmethodID, args : *mut jvalue) -> jdouble,

    pub CallStaticVoidMethod : extern "C" fn(env : *mut JNIEnv, cls : jclass, methodID : jmethodID, ...) -> void,
    pub CallStaticVoidMethodV : extern "C" fn(env : *mut JNIEnv, cls : jclass, methodID : jmethodID, args : va_list) -> void,
    pub CallStaticVoidMethodA : extern "C" fn(env : *mut JNIEnv, cls : jclass, methodID : jmethodID, args : *mut jvalue),

    pub GetStaticFieldID : extern "C" fn(env : *mut JNIEnv, clazz : jclass, name : *mut char, sig : *mut char) -> jfieldID,
    pub GetStaticObjectField : extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID) -> jobject,
    pub GetStaticBooleanField : extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID) -> jboolean,
    pub GetStaticByteField : extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID) -> jbyte,
    pub GetStaticCharField : extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID) -> jchar,
    pub GetStaticShortField : extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID) -> jshort,
    pub GetStaticIntField : extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID) -> jint,
    pub GetStaticLongField : extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID) -> jlong,
    pub GetStaticFloatField : extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID) -> jfloat,
    pub GetStaticDoubleField : extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID) -> jdouble,

    pub SetStaticObjectField: extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID, value : jobject) -> void,
    pub SetStaticBooleanField: extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID, value : jboolean) -> void,
    pub SetStaticByteField: extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID, value : jbyte) -> void,
    pub SetStaticCharField: extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID, value : jchar) -> void,
    pub SetStaticShortField: extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID, value : jshort) -> void,
    pub SetStaticIntField: extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID, value : jint) -> void,
    pub SetStaticLongField: extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID, value : jlong) -> void,
    pub SetStaticFloatField: extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID, value : jfloat) -> void,
    pub SetStaticDoubleField: extern "C" fn(env : *mut JNIEnv, clazz : jclass, fieldID : jfieldID, value : jdouble) -> void,

    pub NewString: extern "C" fn(env : *mut JNIEnv, unicode : *mut jchar, jsize) -> jstring,
    pub GetStringLength: extern "C" fn(env : *mut JNIEnv, str : jstring) -> jsize,
    pub GetStringChars: extern "C" fn (env : *mut JNIEnv, str : jstring, isCopy : *mut jboolean) -> *mut jchar,
    pub ReleaseStringChars: extern "C" fn(env : *mut JNIEnv, str : jstring, chars : *mut jchar) -> void,

    pub NewStringUTF: extern "C" fn(env : *mut JNIEnv, utf : *mut char) -> jstring,
    pub GetStringUTFLength: extern "C" fn(env : *mut JNIEnv, str : jstring) -> jsize,
    pub GetStringUTFChars: extern "C" fn(env : *mut JNIEnv, str : jstring, isCopy : *mut jboolean) -> *mut char,
    pub ReleaseStringUTFChars: extern "C" fn(env : *mut JNIEnv, str : jstring, chars : *mut char),

    pub GetArrayLength: extern "C" fn(env : *mut JNIEnv, array : jarray) -> jsize,

    pub NewObjectArray: extern "C" fn(env : *mut JNIEnv, len : jsize, clazz : jclass, init : jobject) -> jobjectArray,
    pub GetObjectArrayElement: extern "C" fn(env : *mut JNIEnv, array : jobjectArray, index : jsize) -> jobject,
    pub SetObjectArrayElement: extern "C" fn(env : *mut JNIEnv, array : jobjectArray, index : jsize, val : jobject) -> void,

    pub NewBooleanArray: extern "C" fn(env : *mut JNIEnv, len : jsize) -> jbooleanArray,
    pub NewByteArray: extern "C" fn(env : *mut JNIEnv, len : jsize) -> jbyteArray,
    pub NewCharArray: extern "C" fn(env : *mut JNIEnv, len : jsize) -> jcharArray,
    pub NewShortArray: extern "C" fn(env : *mut JNIEnv, len : jsize) -> jshortArray,
    pub NewIntArray: extern "C" fn(env : *mut JNIEnv, len : jsize) -> jintArray,
    pub NewLongArray: extern "C" fn(env : *mut JNIEnv, len : jsize) -> jlongArray,
    pub NewFloatArray: extern "C" fn(env : *mut JNIEnv, len : jsize) -> jfloatArray,
    pub NewDoubleArray: extern "C" fn(env : *mut JNIEnv, len : jsize) -> jdoubleArray,

    pub GetBooleanArrayElements: extern "C" fn(env : *mut JNIEnv, array : jbooleanArray, isCopy : *mut jboolean) -> *mut jboolean,
    pub GetByteArrayElements: extern "C" fn(env : *mut JNIEnv, array : jbyteArray, isCopy : *mut jboolean) -> *mut jbyte,
    pub GetCharArrayElements: extern "C" fn(env : *mut JNIEnv, array : jcharArray, isCopy : *mut jboolean) -> *mut jchar,
    pub GetShortArrayElements: extern "C" fn(env : *mut JNIEnv, array : jshortArray, isCopy : *mut jboolean) -> *mut jshort,
    pub GetIntArrayElements: extern "C" fn(env : *mut JNIEnv, array : jintArray, isCopy : *mut jboolean) -> *mut jint,
    pub GetLongArrayElements: extern "C" fn(env : *mut JNIEnv, array : jlongArray, isCopy : *mut jboolean) -> *mut jlong,
    pub GetFloatArrayElements: extern "C" fn(env : *mut JNIEnv, array : jfloatArray, isCopy : *mut jboolean) -> *mut jfloat,
    pub GetDoubleArrayElements: extern "C" fn(env : *mut JNIEnv, array : jdoubleArray, isCopy : *mut jboolean) -> *mut jdouble,

    pub ReleaseBooleanArrayElements: extern "C" fn(env : *mut JNIEnv, array : jbooleanArray, elems : *mut jboolean, mode : jint) -> void,
    pub ReleaseByteArrayElements: extern "C" fn(env : *mut JNIEnv, array : jbyteArray, elems : *mut jbyte, mode : jint) -> void,
    pub ReleaseCharArrayElements: extern "C" fn(env : *mut JNIEnv, array : jcharArray, elems : *mut jchar, mode : jint) -> void,
    pub ReleaseShortArrayElements: extern "C" fn(env : *mut JNIEnv, array : jshortArray, elems : *mut jshort, mode : jint) -> void,
    pub ReleaseIntArrayElements: extern "C" fn(env : *mut JNIEnv, array : jintArray, elems : *mut jint, mode : jint) -> void,
    pub ReleaseLongArrayElements: extern "C" fn(env : *mut JNIEnv, array : jlongArray, elems : *mut jlong, mode : jint) -> void,
    pub ReleaseFloatArrayElements: extern "C" fn(env : *mut JNIEnv, array : jfloatArray, elems : *mut jfloat, mode : jint) -> void,
    pub ReleaseDoubleArrayElements: extern "C" fn(env : *mut JNIEnv, array : jdoubleArray, elems : *mut jdouble, mode : jint) -> void,

    pub GetBooleanArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jbooleanArray, start : jsize, l : jsize, buf : *mut jboolean) -> void,
    pub GetByteArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jbyteArray, start : jsize, len : jsize, buf : *mut jbyte) -> void,
    pub GetCharArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jcharArray, start : jsize, len : jsize, buf : *mut jchar) -> void,
    pub GetShortArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jshortArray, start : jsize, len : jsize, buf : *mut jshort) -> void,
    pub GetIntArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jintArray, start : jsize, len : jsize, buf : *mut jint) -> void,
    pub GetLongArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jlongArray, start : jsize, len : jsize, buf : *mut jlong) -> void,
    pub GetFloatArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jfloatArray, start : jsize, len : jsize, buf : *mut jfloat) -> void,
    pub GetDoubleArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jdoubleArray, start : jsize, len : jsize, buf : *mut jdouble) -> void,

    pub SetBooleanArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jbooleanArray, start : jsize, l : jsize, buf : *mut jboolean) -> void,
    pub SetByteArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jbyteArray, start : jsize, len : jsize, buf : *mut jbyte) -> void,
    pub SetCharArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jcharArray, start : jsize, len : jsize, buf : *mut jchar) -> void,
    pub SetShortArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jshortArray, start : jsize, len : jsize, buf : *mut jshort) -> void,
    pub SetIntArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jintArray, start : jsize, len : jsize, buf : *mut jint) -> void,
    pub SetLongArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jlongArray, start : jsize, len : jsize, buf : *mut jlong) -> void,
    pub SetFloatArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jfloatArray, start : jsize, len : jsize, buf : *mut jfloat) -> void,
    pub SetDoubleArrayRegion: extern "C" fn(env : *mut JNIEnv, array : jdoubleArray, start : jsize, len : jsize, buf : *mut jdouble) -> void,

    pub RegisterNatives: extern "C" fn(env : *mut JNIEnv, clazz : jclass, methods : *mut JNINativeMethod, nMethods : jint) -> jint,
    pub UnregisterNatives: extern "C" fn(env : *mut JNIEnv, clazz : jclass) -> jint,

    pub MonitorEnter: extern "C" fn(env : *mut JNIEnv, obj : jobject) -> jint,
    pub MonitorExit: extern "C" fn(env : *mut JNIEnv, obj : jobject) -> jint,

    pub GetJavaVM: extern "C" fn(env : *mut JNIEnv, vm : *mut *mut JavaVM) -> jint,

    pub GetStringRegion: extern "C" fn(env : *mut JNIEnv, str : jstring, start : jsize, len : jsize, buf : *mut jchar) -> void,
    pub GetStringUTFRegion: extern "C" fn(env : *mut JNIEnv, str : jstring, start : jsize, len : jsize, buf : *mut char) -> void,

    pub GetPrimitiveArrayCritical: extern "C" fn(env : *mut JNIEnv, array : jarray, isCopy : *mut jboolean) -> *mut void,
    pub ReleasePrimitiveArrayCritical: extern "C" fn(env : *mut JNIEnv, array : jarray, carray : *mut void, mode : jint) -> void,

    pub GetStringCritical: extern "C" fn(env : *mut JNIEnv, string : jstring, isCopy : *mut jboolean) -> *mut jchar,
    pub ReleaseStringCritical: extern "C" fn(env : *mut JNIEnv, string : jstring, cstring : *mut jchar) -> void,

    pub NewWeakGlobalRef: extern "C" fn(env : *mut JNIEnv, obj : jobject) -> jweak,
    pub DeleteWeakGlobalRef: extern "C" fn(env : *mut JNIEnv, reference : jweak) -> void,

    pub ExceptionCheck: extern "C" fn(env : *mut JNIEnv) -> jboolean,

    pub NewDirectByteBuffer: extern "C" fn(env : *mut JNIEnv, address : *mut void, capacity : jlong) -> jobject,
    pub GetDirectBufferAddress: extern "C" fn(env : *mut JNIEnv, buf : jobject) -> *mut void,
       
    pub GetDirectBufferCapacity: extern "C" fn(env : *mut JNIEnv, buf : jobject) -> jlong,

    /* New JNI 1.6 Features */

    pub GetObjectRefType: extern "C" fn(env : *mut JNIEnv, obj : jobject) -> jobjectRefType
}

pub struct JavaVMOption {
    pub optionString: *mut libc::c_char,
    pub extraInfo: *mut libc::c_void
}

pub struct JavaVMInitArgs {
    pub version: jint,
	pub nOptions: jint,
    pub options: *mut JavaVMOption,
    pub ignoreUnrecognized: jboolean
}

pub struct JavaVMAttachArgs {
    pub version: jint,

    pub name: *mut libc::c_char,
    pub group: jobject
}

/* End VM-specific. */

struct JNIInvokeInterface_ {
    reserved0: *mut libc::c_void,
    reserved1: *mut libc::c_void,
    reserved2: *mut libc::c_void,
    
    pub DestroyJavaVM: extern "C" fn (vm: *mut JavaVM) -> jint,
	pub AttachCurrentThread: extern "C" fn (vm: *mut JavaVM, penv: *mut *mut libc::c_void, args: *mut libc::c_void) -> jint,
	pub DetachCurrentThread: extern "C" fn (vm: *mut JavaVM) -> jint,
	pub GetEnv: extern "C" fn (vm: *mut JavaVM, penv: *mut *mut libc::c_void, version: jint) -> jint,    
	pub AttachCurrentThreadAsDaemon: extern "C" fn (vm: *mut JavaVM, penv: *mut *mut libc::c_void, args: *mut libc::c_void) -> jint
}

pub type JavaVM = *mut JNIInvokeInterface_;