package com.shangguigu.chapter05

/**
 * Created by liuquan on 2020/3/2.
 */
object Method2Function {
    def main(args: Array[String]): Unit = {
        // 创建一个对象，来使用方法
        val dog = new Dog
        println(dog.sum(10, 20))

        // 将方法method转换成函数function
        val f1 = dog.sum _
        println("f1= " + f1)    // <function2>，后面的2表示该函数function有2个形参
        println("f1= " + f1(23, 34))

        // 定义函数function
        val f2 = (n1: Int, n2: Int) => {
            n1 + n2
        }

        println("f2= " + f2)    // <function2>，后面的2表示该函数function有2个形参
        println("f2= " + f2(23, 34))
    }
}


class Dog {
    // 定义方法method
    def sum(n1: Int, n2: Int): Int = {
        n1 + n2
    }
}