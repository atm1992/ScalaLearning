package com.shangguigu.chapter04.mutlfor

/**
 * Created by liuquan on 2020/3/2.
 * 打印出九九乘法表
 */
object Exercise03 {
    def main(args: Array[String]): Unit = {
        val num = 9
        for (r <- 1 to num) {
            for (c <- 1 to r) {
                printf("%d * %d = %d\t", r, c, r * c)
            }
            println()
        }
    }
}
