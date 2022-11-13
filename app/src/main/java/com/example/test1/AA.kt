package com.example.test1

import java.util.*
import java.util.concurrent.Executors
import java.util.concurrent.ThreadPoolExecutor


class AA {
    companion object {
        /** 我是main入口函数 **/
        @JvmStatic
        fun main(args: Array<String>) {
//            System.out.print("main方法")
//            var demo1 = Demo1()
//            demo1.testFun("content 测试哈哈哈")
            Thread()

        }
    }

}

internal class MyThread : Runnable {
    override fun run() {
        println(Thread.currentThread().name + "线程开始执行")
        for (i in 0..999) {
            println("子线程输出:$i")
        }
        println(Thread.currentThread().name + "线程执行完毕")
    }
}

fun main(args: Array<String>) {
    testSort3()

}

class Node {
    var value: String? = null
    var left: Node? = null
    var right: Node? = null
}

class Node1 {
    var value: String? = null
    var pres: List<Node>? = null
    var childs: List<Node>? = null
}

fun testSort2(root: Node1) {
    val equeue = LinkedList<Node1>()
    equeue.offer(root)

    while (equeue.isNotEmpty()) {
        val iterator = equeue.iterator()
        if (iterator.hasNext()) {
            val next = iterator.next()
            if (next.pres?.isEmpty() == true || next.pres?.size!! <= 1) {
                doValue(next.value)

            }
        }


    }

}

fun doValue(value: String?) {
    TODO("Not yet implemented")
}


fun testsort(root: Node?) {
    if (root != null) {
        testsort(root.left)
        println(root.value)
        testsort(root.right)
    }
}


fun testSort1(root: Node) {
    val equeue = LinkedList<Node>()
    equeue.offer(root)
    while (equeue.isNotEmpty()) {
        val poll = equeue.poll()
        if (poll != null) {
            println(poll.value)
            equeue.offer(poll.left)
            equeue.offer(poll.right)
        }
    }
}

fun testSort3() {
    var books = arrayOf(2, 5, 1,454,4,456,666)
    testSort4(books, 0, books.size-1)
    println(books.asList().toString())

}

fun testSort4(d: Array<Int>, start: Int, end: Int) {
    if (start >= end) {
        return
    }

    var temp = d[end]
    var mid = start
    for (i in start until end+1) {
        if (d[i] < temp) {
            val temp = d[mid]
            d[mid] = d[i]
            d[i] = temp
            mid++
        }
    }
    d[end] = d[mid]
    d[mid] = temp


    testSort4(d, start, mid - 1)
    testSort4(d, mid+1, end)
}
