package com.shangguigu.chapter13

/**
 * Created by liuquan on 2020/3/22.
 */
object FuncParam {
    def main(args: Array[String]): Unit = {
        def plus(x: Int) = 3 + x
        val res = Array(1, 2, 3, 4).map(plus(_)) // 这里的map(plus(_))也可直接写成map(plus)
        println(res.mkString(","))      // 4,5,6,7
        println("plus函数的类型为：" + (plus _))   // <function1>

        def minus(a: Int, b: Int) = a - b
        println("minus函数的类型为：" + minus _)   // <function2>

    }
}
