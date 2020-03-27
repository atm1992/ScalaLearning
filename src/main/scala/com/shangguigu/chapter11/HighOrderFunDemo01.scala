package com.shangguigu.chapter11

/**
 * Created by liuquan on 2020/3/19.
 * 高阶函数的基本使用
 */
object HighOrderFunDemo01 {
    def main(args: Array[String]): Unit = {
        val res = test(sum2, 3.5)
        println("res= " + res)

        test2(sayOK)

        // 这里的myPrint函数会被执行，然后将函数的执行结果(这里是Unit)赋给变量f1
        val f1 = myPrint    // hello world
        println(f1)         // ()

        // 这里的myPrint函数不会执行。表示将myPrint函数赋给变量f2，此时的变量f2指向一个函数
        val f2 = myPrint _
        println(f2)         // <function0>，0表示没有入参
        f2()                // hello world
    }

    def myPrint(): Unit ={
        println("hello world")
    }

    /**
     * test是一个高阶函数
     *
     * @param f  : Double => Double 是一个普通函数，该函数可接受一个Double入参，然后返回一个Double值
     * @param n1 : n1: Double 传入的Double型参数
     */
    def test(f: Double => Double, n1: Double) = {
        f(n1)
    }

    // sum2 是一个普通函数，接受一个Double入参，然后返回一个Double值
    def sum2(d: Double): Double = {
        d + d
    }

    // f:()=>Unit 是一个普通函数，该函数没有入参，返回值类型为Unit
    def test2(f:()=>Unit): Unit ={
        f()
    }

    def sayOK(): Unit ={
        println("sayOk")
    }
}
