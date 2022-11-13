package com.example.test1

import androidx.lifecycle.MutableLiveData


class 匿名{
    fun good(my:Myinterface){
        my.test()
    }
}
interface Myinterface{
    fun test()
}

// This is Arrays.binarySearch(), but doesn't do any argument validation.
fun binarySearch(array: List<Int>, size: Int, value: Int): Int {
    var lo = 0
    var hi = size - 1
    while (lo <= hi) {
        val mid = lo + hi ushr 1
        val midVal = array[mid]
        if (midVal < value) {
            lo = mid + 1
        } else if (midVal > value) {
            hi = mid - 1
        } else {
            return mid // value found
        }
    }
    return lo.inv() // value not present
}

fun main() {
    val list = listOf<Int>(1,35,67,89,90)
    val binarySearch = binarySearch(list, 5, 91)
    println(binarySearch)
}


