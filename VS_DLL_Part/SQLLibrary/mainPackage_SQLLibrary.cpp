#include <iostream>
#include <string>
#include "mainPackage_SQLLibrary.h"

using namespace std;

JNIEXPORT jstring JNICALL Java_mainPackage_SQLLibrary_queryDataBase(JNIEnv* env, jobject thisObj, jstring mySTR)
{
	const char* mySTRCArr = env->GetStringUTFChars(mySTR, NULL);
	if (mySTRCArr == NULL)
		return NULL;

	std::cout << mySTRCArr << std::endl;

	env->ReleaseStringUTFChars(mySTR, mySTRCArr);

	return env->NewStringUTF("null");
}