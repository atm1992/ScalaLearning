package com.shangguigu.chapter05

/**
 * Created by liuquan on 2020/3/2.
 * 猴子吃桃子问题
 * 有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后每天猴子都吃其中的一半，然后
 * 再多吃一个。当到第十天时，想再吃时（还没吃），发现只有1 个桃子了。问题：最初共多少个桃
 * 子？
 * f(10)=1
 * f(9)=(f(10)+1)*2
 */
object Exercise3 {
    def main(args: Array[String]): Unit = {
        printf("最初共有 %d 个桃子\n", peach(1))
        println("n1+n2:" + sum(10, 20))
    }

    def sum(n1: Int, n2: Int): Unit = {
        // return语句不生效
        return n1 + n2
    }

    def peach(n: Int): Int = {
        if (n == 10) {
            1
        } else {
            (peach(n + 1) + 1) * 2
        }
    }
}
