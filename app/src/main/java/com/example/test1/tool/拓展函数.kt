package com.example.test1.tool


val str1: String = "".run {
    println(this.length)
    this
}

val str2: String = with("") {
    println(this.length)
    this
}

val str3: String = "".apply {
    println(this.length)
}

val str4: String = "".also {
    println(it.length)
}

val str5: String = "".let {
    println(it.length)
    it
}
