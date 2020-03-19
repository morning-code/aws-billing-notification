/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package io.code.morning

import com.amazonaws.services.lambda.runtime.Context


class AwsBillingNotification {

    fun handler(count: Int, context: Context): String {
        val lambdaLogger = context.getLogger()
        lambdaLogger.log("Kotlinモジュールですよ！！！\n")
        lambdaLogger.log("count = " + count +"\n")
        lambdaLogger.log("インプットの3倍の値が出てきますよ！、テストパラメタは全て第一引数に入ってくるようです。\n")
        return "${count * 3}"
    }
}

