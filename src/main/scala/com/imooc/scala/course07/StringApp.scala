package com.imooc.scala.course07

/**
 * Created by liuquan on 2020/1/9.
 */
object StringApp extends App {
    val s = "hello: "
    val name = "lq"
    println(s + name)
    println(s"hello:$name")
    val school = "buaa"
    println(s"hello:$name, welcome to $school")

    val b =
        """
          |这是一个多行字符串
          |hello
          |world
          |""".stripMargin
    println(b)
}
