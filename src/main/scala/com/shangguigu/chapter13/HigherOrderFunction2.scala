package com.shangguigu.chapter13

/**
 * Created by liuquan on 2020/3/22.
 */
object HigherOrderFunction2 {
    def main(args: Array[String]): Unit = {
        // 这里其实用到了闭包
        def minusxy(x: Int) = {
            (y: Int) => x - y       // 匿名函数，可使用变量来接收返回的该匿名函数
        }

        // 这里的f1是个函数，(y: Int) => 3 - y
        val f1 = minusxy(3)
        println(f1(1))              // 3 - 1 = 2
        println("f1的类型为：" + f1)     // <function1>

        // 使用函数柯里化的形式
        println(minusxy(4)(9))          // 4 - 9 = -5
    }
}
