package com.shangguigu.chapter05

/**
 * Created by liuquan on 2020/3/2.
 */
object FuncInFunc {
    def main(args: Array[String]): Unit = {
        def sayHi(): Unit = {           // private final void sayHi$1()
            println("say hi 2")

            def sayHi(): Unit = {       // private final void sayHi$2()
                println("say hi 3")
            }
        }

        sayHi()     // say hi 2
        println("sum = "+sum())
    }

    def sayHi(): Unit = {               // public void sayHi()
        println("say hi 1")
    }

    def sum(n1:Int=3,n2:Int=4): Int ={
        n1+n2
    }
}
