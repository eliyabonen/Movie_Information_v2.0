#include "jni.h"

#ifndef _Included_mainPackage_SQLLibrary
#define _Included_mainPackage_SQLLibrary
#ifdef __cplusplus
extern "C" {
#endif

	JNIEXPORT jstring JNICALL Java_mainPackage_SQLLibrary_queryDataBase(JNIEnv* env, jobject thisObj, jstring mySTR);


#ifdef __cplusplus
}
#endif
#endif
