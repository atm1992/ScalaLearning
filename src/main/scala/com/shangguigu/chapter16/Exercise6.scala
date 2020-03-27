package com.shangguigu.chapter16

/**
 * Created by liuquan on 2020/3/25.
 */
object Exercise6 extends App {
    // 求阶乘
    def factorial(n:Int)= 1.to(n).reduce(_*_)

    println(factorial(4))
    println(factorial(15))
}
