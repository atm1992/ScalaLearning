package com.shangguigu.chapter13

/**
 * Created by liuquan on 2020/3/22.
 * 1、编写一个函数makeSuffix(suffix: String) 可以接收一个文件后缀名(比如.jpg)， 并返回一个闭包。
 * 2、调用闭包，可以传入一个文件名，如果该文件名没有指定的后缀(比如.jpg) ,则返回文件名.jpg , 如果已经有.jpg 后缀，则返回原文件名。
 */
object ClosureDemo {
    def main(args: Array[String]): Unit = {
        val f = makeSuffix(".jpg")
        println(f("dog.jpg"))   // dog.jpg
        println(f("cat"))       // cat.jpg
    }

    def makeSuffix(suffix: String) = {
        (filename: String) => {
            if (filename.endsWith(suffix)) {
                filename
            } else {
                filename + suffix
            }
        }
    }
}
