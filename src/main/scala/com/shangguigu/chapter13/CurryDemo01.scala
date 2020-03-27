package com.shangguigu.chapter13

/**
 * Created by liuquan on 2020/3/22.
 */
object CurryDemo01 {
    def main(args: Array[String]): Unit = {
        // 普通形式
        def mul1(x: Int, y: Int) = {
            x * y
        }
        println(mul1(10, 7))        // 70

        // 闭包形式
        def mul2(x: Int) = {
            (y: Int) => x * y
        }
        println(mul2(10)(7))        // 70

        // 函数柯里化形式
        def mul3(x: Int)(y: Int) = {
            x * y
        }
        println(mul3(10)(7))        // 70
    }
}
