package com.shangguigu.chapter04.ifelse

//import scala.io.StdIn       // 只是导入StdIn

import scala.io._ // _ 表示将scala.io包里的所有内容一起导入

/**
 * Created by liuquan on 2020/3/1.
 */
object Demo01 {
    def main(args: Array[String]): Unit = {
        println("请输入年龄：")
        val age = StdIn.readInt()
        if (age > 18) {
            println("age>18")
        }

        if (age > 18) {
            println("age>18")
        } else {
            println("age<=18")
        }
    }
}
