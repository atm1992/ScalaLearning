package com.shangguigu.chapter08.homework

/**
 * Created by liuquan on 2020/3/6.
 *
 * 使用 trait App 以反序打印命令行参数，用空格隔开。例如：scala Reverse Hello World 应该打印 World Hello
 */
object Exercise02 extends App {
    // 在右上角的Edit Configurations...中配置Program arguments
    val args2 =  args.reverse
    println(args2.mkString(" "))
}
