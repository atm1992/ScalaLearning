package com.shangguigu.chapter07.myextends

import com.shangguigu.chapter07.Person3

/**
 * Created by liuquan on 2020/3/4.
 */
object Extends01 {
    def main(args: Array[String]): Unit = {
        val s1 = new Student
        // 子类可以调用父类中的public name_$eq()方法
        s1.name = "Tom"
        s1.showInfo
        s1.study
    }
}

class Person {
    var name: String = _
    var age: Int = _

    def showInfo: Unit = {
        println("学生信息如下：" + this.name)
    }
}

class Student extends Person {
    def study: Unit = {
        println(this.name + " 学习Scala中……")
    }
}