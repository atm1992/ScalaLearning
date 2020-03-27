package com.shangguigu.chapter05

/**
 * Created by liuquan on 2020/3/2.
 */
object LazyDemo {
    def main(args: Array[String]): Unit = {
        lazy val res = sum(10, 20)      // 执行顺序为：1、3、2
        // val res = sum(10, 20)                 // 执行顺序为：3、1、2
        println("-----------------------")      // 编号 1
        println("res=" + res)       // 编号 2
    }

    def sum(n1: Int, n2: Int): Int = {
        println("sum函数被执行了")    // 编号 3
        n1 + n2
    }
}
