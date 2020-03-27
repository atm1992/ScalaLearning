package com.shangguigu.chapter11

/**
 * Created by liuquan on 2020/3/20.
 */
object ScanDemo01 {
    def main(args: Array[String]): Unit = {
        def minus(n1: Int, n2: Int): Int = {
            n1 - n2
        }

        // 5 (1, 2, 3, 4) => (5, 4, 2, -1, -5)
        val s1 = (1 to 4).scanLeft(5)(minus)
        println(s1)     // Vector(5, 4, 2, -1, -5)

        // (1, 2, 3, 4) 5 => (3, -2, 4, -1, 5)
        val s2 = (1 to 4).scanRight(5)(minus)
        println(s2)     // Vector(3, -2, 4, -1, 5)
    }
}
