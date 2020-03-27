package com.shangguigu.chapter01

/**
 * Created by liuquan on 2020/1/10.
 */
object TypeDemo {
    def main(args: Array[String]): Unit = {
        val num1: Int = 10
        println(num1.toDouble + num1.toString)

        val isPass = true // Boolean类型变量。变量的数据类型可以省略，因为编译器会自动推导类型
        println(isPass.toString)
        //        println(sayHello)

        println("Long的范围" + Long.MaxValue + " ~ " + Long.MinValue)

        println("ok")

        math.sqrt(3)
    }

    def sayHello: Nothing = {
        throw new Exception("抛出异常")
    }

}

class Dog{

}