package com.shangguigu.chapter05

/**
 * Created by liuquan on 2020/3/2.
 * 可变参数
 */
object VarParameters {
    def main(args: Array[String]): Unit = {
        println(sum0(2,4,6,8,9))
        println(sum1(1,3,4,7,5))
        println(f1)
        println(f2)

    }

    // 支持0到多个参数
    def sum0(args: Int*): Int = {
        var sum = 0
        for (item <- args) {
            sum += item
        }
        sum
    }

    // 支持1到多个参数
    def sum1(n1: Int, args: Int*): Int = {
        var sum = n1
        for (item <- args) {
            sum += item
        }
        sum
    }

    // 错误！可变参数必须放在最后
//    def sum2(args: Int*, n1: Int): Int = {
//        var sum = n1
//        for (item <- args) {
//            sum += item
//        }
//        sum
//    }

    def f1 = "hello"

    def f2(): String ={
        "hello"
    }

}
