package com.shangguigu.chapter05

/**
 * Created by liuquan on 2020/3/2.
 */
object FuncTheory {

    def sum(n1: Int, n2: Int): Int = {
        n1 + n2
    }

    def main(args: Array[String]): Unit = {
        val n1 = 10
        val n2 = 20
        val res = sum(n1, n2)
        println("res= " + res)
    }
}
