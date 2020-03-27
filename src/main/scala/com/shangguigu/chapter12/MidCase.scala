package com.shangguigu.chapter12

/**
 * Created by liuquan on 2020/3/21.
 */
object MidCase {
    def main(args: Array[String]): Unit = {
        List(1, 3, 5, 9) match {
            case first :: second => println(first + " " + second)   // 1 List(3, 5, 9)
            case _ => println("匹配不到")
        }
    }
}
