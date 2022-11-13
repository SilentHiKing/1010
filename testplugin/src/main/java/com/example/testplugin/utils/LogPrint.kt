package com.example.testplugin.utils

import java.util.concurrent.Executors


object LogPrint {

    private val logThreadExecutor = Executors.newSingleThreadExecutor()

    fun log(log: Any?) {
        logThreadExecutor.submit {
            println(log)
        }
    }

}