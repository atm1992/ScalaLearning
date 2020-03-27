package com.shangguigu.chapter14

/**
 * Created by liuquan on 2020/3/22.
 * 求阶乘
 */
object RecursiveDemo04 {
    def main(args: Array[String]): Unit = {
        println("9的阶乘为：" + getFactorial(10))
    }

    // 使用递归求阶乘
    def getFactorial(num: Int): Int = {
        if (num == 0) 1
        else num * getFactorial(num - 1)
    }
}
