 package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.tracing.Trace
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.test1.apt.test1
import com.example.test1.tool.AnimatorHelper
import com.example.test1.tool.GlideHelper
import com.example.test1.tool.GlideHelper.test
import java.util.*
import kotlin.collections.HashMap

 @Route(path = "/test/activity")
 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val map = ArrayList<String>()

        map.iterator()
        Thread(object :Runnable{
            override fun run() {
             }

        }).start()
        findViewById<View>(R.id.tvhello).setOnClickListener {
            hello()
            world()
            test1()
        }

        MutableLiveData<String>().observe(this){

        }
    }

     private fun world() {
         println("fasff")
     }

     override fun onResume() {
         super.onResume()


     }

     private fun hello() {

         Trace.beginSection("MyAdapter.onCreateViewHolder")
         println("hello")
         try {
             ARouter.getInstance().build("/testone/activity2").navigation()

//             throw Exception("a的值大于0，不符合要求")
         } catch (e: Exception) {
         }
         Trace.endSection()

     }


 }