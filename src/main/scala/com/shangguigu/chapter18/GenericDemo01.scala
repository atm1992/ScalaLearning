package com.shangguigu.chapter18

/**
 * Created by liuquan on 2020/3/26.
 */
object GenericDemo01 extends App {
    val intMessage = new IntMessage[Int](10)
    println("intMessage = " + intMessage)

    val stringMessage = new StringMessage[String]("hello")
    println("stringMessage = " + stringMessage)
}

abstract class Message[T](s: T) {
    def get = s
}

// 子类在扩展时，约定具体的数据类型
class IntMessage[Int](v: Int) extends Message(v)

class StringMessage[String](v: String) extends Message(v)