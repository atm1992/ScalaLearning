package com.imooc.scala.course04

/**
 * Created by liuquan on 2020/1/8.
 */
object AbstractApp {
    def main(args: Array[String]): Unit = {
        val student = new Student2()
        println(student.name)
        student.speak
    }
}

abstract class Person2{
    def speak
    val name:String
    val age:Int
}

class Student2 extends Person2{
    override def speak: Unit = {
        println("speak")
    }

    override val name: String = "lq"
    override val age: Int = 27
}