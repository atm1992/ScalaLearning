package com.shangguigu.chapter18

/**
 * Created by liuquan on 2020/3/27.
 */
object GenericDemo03 {
    def midList[A](li: List[A]): A = {
        li(li.length / 2)
    }

    def main(args: Array[String]): Unit = {
        val l1 = List("Hello", "World", "scala", "spark")
        println(midList(l1))    // scala

        val l2 = List(44, 23, 2, 56, 69)
        println(midList(l2))    // 2
    }
}
