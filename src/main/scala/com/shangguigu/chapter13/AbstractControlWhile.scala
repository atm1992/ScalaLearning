package com.shangguigu.chapter13

/**
 * Created by liuquan on 2020/3/22.
 */
object AbstractControlWhile {
    def main(args: Array[String]): Unit = {
        var x = 10
        while (x > 0) {
            x -= 1
            println("x= " + x)
        }

        x = 10
        // 使用控制抽象自己实现的一个while循环
        myWhile(x > 0) {
            x -= 1
            println("x= " + x)
        }
    }

    // 使用控制抽象自己写一个函数，来实现类似while循环的效果
    // 这里的 condition: => Boolean 是一个匿名函数，codeBlock: => Unit 也是一个匿名函数
    def myWhile(condition: => Boolean)(codeBlock: => Unit): Unit = {
        if (condition) {
            codeBlock
            myWhile(condition)(codeBlock)       // 使用递归
        }
    }
}
