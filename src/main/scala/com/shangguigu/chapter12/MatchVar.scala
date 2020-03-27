package com.shangguigu.chapter12

/**
 * Created by liuquan on 2020/3/20.
 */
object MatchVar {
    def main(args: Array[String]): Unit = {
        val ch = 'v'
        ch match {
            case '+' => println("ok +")
            case mychar => println("ok " + mychar) // 将传入的ch值赋给变量mychar
        }

        // match是一个表达式，它可以有返回值
        val res = ch match {
            case '+' => ch + " hello"
            case _ => "default"
        }
        println("res= " + res)
    }
}
