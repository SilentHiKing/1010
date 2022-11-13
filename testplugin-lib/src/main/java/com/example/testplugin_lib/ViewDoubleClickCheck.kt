package com.example.testplugin_lib

import android.util.Log
import android.view.View


object ViewDoubleClickCheck {

    private const val MIN_DURATION = 500L

    private var lastClickTime = 0L

    private var clickIndex = 0

    @JvmStatic
    fun onClick(view: View): Boolean {
        clickIndex++
        log("onClick $clickIndex")
        val currentTime = System.currentTimeMillis()
        if (currentTime - lastClickTime > MIN_DURATION) {
            lastClickTime = currentTime
            log("onClick isEnabled : true")
            return true
        }
        log("onClick isEnabled : false")
        return false
    }

    private fun log(log: String) {
        Log.e("ViewDoubleClickCheck", log)
    }

}