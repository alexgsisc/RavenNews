package com.raven.core.extensionFunctions

import android.util.Log

fun Any.tag(): String = this::class.java.simpleName

fun Any.logError(message: String?) {
    Log.e(tag(), buildMessage(message))
}

fun Any.logInfo(message: String) {
    Log.i(tag(), buildMessage(message))
}

fun buildMessage(msg: String?): String {
    val ste = Thread.currentThread().stackTrace[4]
    val sb = StringBuilder()
    sb.append("[")
    sb.append(ste.fileName.replace(".java", ""))
    sb.append("::")
    sb.append(ste.methodName)
    sb.append("]")
    sb.append(msg)
    return sb.toString()
}