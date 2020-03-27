package com.shangguigu.chapter04.ifelse

/**
 * Created by liuquan on 2020/3/1.
 */
object Exercise03 {
    def main(args: Array[String]): Unit = {
        val sumVal = 9
        val res1 =
            if (sumVal > 10) {
                "结果大于10"
            } else {
                "结果小于10"
            }
        println("res1=" + res1)     // res1=结果小于10

        val res2 =
            if (sumVal > 10) {
                "结果大于10"
            }
        println("res2=" + res2)     // res2=()，即 Unit，Unit类型只有一个实例值 ()。类似于Java中的void
    }
}
