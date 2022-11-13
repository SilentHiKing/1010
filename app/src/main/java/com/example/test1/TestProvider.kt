package com.example.test1

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.template.IProvider
@Route(path = "/test/hello", name = "test service")
class TestProvider:IProvider {
    override fun init(context: Context?) {

    }
}