package com.shangguigu.chapter04.forloop

/**
 * Created by liuquan on 2020/3/2.
 * 打印1~100 之间所有是9 的倍数的整数的个数及总和.
 */
object Excecise {
    def main(args: Array[String]): Unit = {
        val start = 1
        val end = 100
        var count = 0
        var sum = 0
        for (i <- start to end if i % 9 == 0) {
            sum += i
            count += 1
        }
        printf("1~100之间是9的倍数有 %d 个，它们的总和为 %d", count, sum)

        // 输出加法的循环表达式
        val num = 8
        for (i <- 0 to num) {
            printf("%d + %d = %d\n", i, num - i, num)
        }

        for (i <- 0 to 3) {
            printf("%d\n",i)
        }

        val a = for (i <- 2 to 4) i
        println(a)
    }
}


