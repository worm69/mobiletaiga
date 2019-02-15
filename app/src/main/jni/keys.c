//
// Created by E818 on 14/02/2019.
//

#include <jni.h>

JNIEXPORT jstring JNICALL
Java_pt_dbmg_mobiletaiga_Login_getRealmKey(JNIEnv *env, jobject instance) {

 return (*env)->  NewStringUTF(env, "TmF0aXZlNWVjcmV0UEBzc3cwcmQx");
}
