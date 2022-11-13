package com.example.test1.apt

import java.util.*

fun main() {

}
fun test1(){
    val load = ServiceLoader.load(SPIService::class.java)
    val iterator: Iterator<SPIService> = load.iterator()

    // 完成方法注入调用

    // 完成方法注入调用
    while (iterator.hasNext()) { // 获取文本文件的内容，得到需要的实现类的名字
        val spiService = iterator.next() // 反射注入实现类的对象
        spiService.execute() // 执行实现类中的方法
    }
}