package com.shangguigu.chapter06

/**
 * Created by liuquan on 2020/3/3.
 */
object MemState {
    def main(args: Array[String]): Unit = {
        val p1 = new Person
        p1.name = "小白"
        val p2 = p1
        println("p2.name is " + p2.name)        // 小白
        println("p1 == p2 : " + (p1 == p2))     // true
        p2.name = "小黑"
        println("p1.name is " + p1.name)        // 小黑
        println("p1 == p2 : " + (p1 == p2))     // true
    }
}

class Person {
    var name: String = _
    var age: Int = _
}