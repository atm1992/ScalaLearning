package com.shangguigu.chapter12

/**
 * Created by liuquan on 2020/3/20.
 */
object MatchVarDemo {
    def main(args: Array[String]): Unit = {
        val (x, y, z) = (1, 'e', "hello")       // 一次性定义多个变量并赋值
        println(x + " " + y + " " + z)
        val (q, r) = BigInt(10) /% 3            // q = BigInt(10) / 3  ， r = BigInt(10) % 3
        println(q + " " + r)
        val arr = Array(1, 4, 7, 9)
        val Array(first, second, _*) = arr      // 将arr数组中的前两个元素提取出来
        println("first is " + first + "\t second is " + second)
    }
}
