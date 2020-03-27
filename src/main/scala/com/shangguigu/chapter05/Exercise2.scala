package com.shangguigu.chapter05

/**
 * Created by liuquan on 2020/3/2.
 * 已知f(1)=3; f(n) = 2*f(n-1)+1;
 * 请使用递归的思想编程，求出f(n)的值?
 */
object Exercise2 {
    def main(args: Array[String]): Unit = {
        val n = 6
        printf("第 %d 个数为：%d", n, func(n))
    }

    def func(n: Int): Int = {
        if (n == 1) {
            3
        } else {
            2 * func(n - 1) + 1
        }
    }
}
