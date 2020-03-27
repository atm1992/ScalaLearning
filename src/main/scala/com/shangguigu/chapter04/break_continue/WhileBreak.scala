package com.shangguigu.chapter04.break_continue

/**
 * Created by liuquan on 2020/3/2.
 */

import scala.util.control.Breaks._

object WhileBreak {
    def main(args: Array[String]): Unit = {
        var n = 1
        /**
         * breakable() 函数的定义：
         * def breakable(op: => Unit) {
         *     try {
         *         op
         *     } catch {
         *         case ex: BreakControl =>
         *             if (ex ne breakException) throw ex
         *     }
         * }
         *
         * breakable()所接收的参数(op: => Unit)为 一个没有输入、也没有返回值的函数；
         * 可以简单地将 op 理解为一段代码块；
         * breakable() 对 break()抛出的breakException异常进行了捕获处理；
         * 如果传入的 op 是一段代码块，通常会将 breakable() 写成 breakable{}
         * breakable {
         *      op
         * }
         */
        breakable(
            while (n < 10) {
                println("n=" + n)
                if (n == 8) {
                    // 在Scala中使用函数式的break()函数来中断循环
                    // break() 通过throw breakException来中断循环，因此外面要捕获异常
                    // 因为break()没有传入参数， 因此可以不写后面的 ()
                    break
                }
                n += 1
            }
        )
        // 若上面不使用breakable()，则会抛出异常，导致这里的"ok"无法执行输出
        println("ok")
    }
}
