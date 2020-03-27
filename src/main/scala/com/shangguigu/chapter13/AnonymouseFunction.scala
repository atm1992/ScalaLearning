package com.shangguigu.chapter13

/**
 * Created by liuquan on 2020/3/22.
 */
object AnonymouseFunction {
    def main(args: Array[String]): Unit = {
        /**
         * 这里的 (x: Double) => 3 * x 就是一个匿名函数，(x: Double) 是该函数的形参列表，
         * => 后面是函数体，3 * x 就是函数体，若函数体有多行，则可使用 {} 包起来。
         * 匿名函数不需要写返回值类型，返回值类型通过类型推断来实现
         * 这里的 triple 就是指向该匿名函数的一个变量，可将其当作函数名来使用
         */
        val triple = (x: Double) => 3 * x
        println(triple(3))      // 9.0
        println(triple)         // <function1>

        val f1 = (n1:Int,n2:Int) => n1+n2
        println("f1的类型为：" + f1)
        println(f1(10,30))
    }
}
