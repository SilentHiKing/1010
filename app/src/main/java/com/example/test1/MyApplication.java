package com.example.test1;

import android.app.Application;

import androidx.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //1.初始化SDK
        ARouter.init(this);

        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){

            @Override
            public void uncaughtException(@NonNull Thread t, @NonNull Throwable e) {
                e.printStackTrace();
                System.out.println("hhhhh");

            }
        });
    }

    protected static final void commonInit() {



    }

}
