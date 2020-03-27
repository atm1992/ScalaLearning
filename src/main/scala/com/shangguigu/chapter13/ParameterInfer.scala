package com.shangguigu.chapter13

/**
 * Created by liuquan on 2020/3/22.
 */
object ParameterInfer {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4)
        // 一步步简写
        println(list.map((x: Int) => x + 1))        // List(2, 3, 4, 5)
        // 参数类型可以推断出来时，可以省略参数类型
        println(list.map((x) => x + 1))
        // 高阶函数所接收的函数只有一个入参时，可以省略参数列表的 ()
        println(list.map(x => x + 1))
        // 参数在 => 后面的函数体内只使用一次时，可以使用 _ 来代替该参数
        println(list.map(_ + 1))

        println(list.reduce((n1: Int, n2: Int) => n1 + n2))     // 10
        println(list.reduce((n1, n2) => n1 + n2))
        println(list.reduce(_ + _))
    }
}
