package com.shangguigu.chapter03.inputcon

import scala.io.StdIn

/**
 * Created by liuquan on 2020/3/1.
 */
object Demo01 {
    def main(args: Array[String]): Unit = {
        println("请输入姓名：")
        val name = StdIn.readLine()
        //        cat.sayHi()
        //        cat.sayHello()
        println("请输入年龄：")
        val age = StdIn.readInt()
        println("请输入薪水：")
        val sal = StdIn.readDouble()
        printf("用户的信息为：name=%s age=%d sal=%f", name, age, sal)

    }
}

//声明了一个对象，这个对象是伴生对象
object cat extends Aa {
    def sayHi(): Unit = {
        println("wowow")
    }
}

trait Aa {
    def sayHello(): Unit = {
        println("Aa hello")
    }
}