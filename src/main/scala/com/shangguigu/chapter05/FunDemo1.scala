package com.shangguigu.chapter05

import scala.io.StdIn

/**
 * Created by liuquan on 2020/3/2.
 * 输入两个数，再输入一个运算符(+-)，得到结果
 */
object FunDemo1 {
    def main(args: Array[String]): Unit = {
        val n1 = 20
        val n2 = 10
        println("请输入运算符(+-)：")
        val oper: Char = StdIn.readChar()
        printf("%d %c %d = %d", n1, oper, n2, getRes(n1, n2, oper))
    }

    def getRes(n1: Int, n2: Int, oper: Char): Any = {
        if (oper == '+') {
            n1 + n2
        } else if (oper == '-') {
            n1 - n2
        } else {
            null
        }
    }
}
