package com.shangguigu.chapter05

/**
 * Created by liuquan on 2020/3/2.
 */
object ExceptionDemo {
    def main(args: Array[String]): Unit = {
        try {
            val r = 10 / 0
        } catch {
            case ex: ArithmeticException => {       // 匹配到了这个case，下一个case将不会被匹配
                println("捕获了除数为零的算数异常")
//                throw new ArithmeticException("算术异常")   // 也可将异常向上抛出，则下面的"ok, next"不会输出，但finally依旧会执行
            }
            case ex: Exception => {
                println("捕获了异常")
            }
        } finally {
            println("the finally")
        }
        println("ok, next")
    }
}
