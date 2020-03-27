package com.shangguigu.chapter03.notice

/**
 * Created by liuquan on 2020/3/1.
 */
object Demo01 {
    def main(args: Array[String]): Unit = {
        /**
         * 案例1: 求两个数的最大值
         * 案例2: 求三个数的最大值
         */
        val n1 = 4
        val n2 = 5
        var res = if (n1 > n2) n1 else n2
        println("res=" + res)
        val n3 = 8
        res = if (n3 > res) n3 else res
        println("res=" + res)
    }
}
