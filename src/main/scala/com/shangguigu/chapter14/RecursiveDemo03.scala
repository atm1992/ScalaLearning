package com.shangguigu.chapter14

/**
 * Created by liuquan on 2020/3/22.
 * 字符串翻转
 */
object RecursiveDemo03 {
    def main(args: Array[String]): Unit = {
        println("hello world\t" + reverseStr("hello world"))
    }

    // 使用递归翻转字符串
    def reverseStr(xs: String): String = {
        if (xs.length < 2) xs
        else reverseStr(xs.tail) + xs.head
    }
}
