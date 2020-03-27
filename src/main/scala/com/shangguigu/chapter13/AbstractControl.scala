package com.shangguigu.chapter13

/**
 * Created by liuquan on 2020/3/22.
 */
object AbstractControl {
    def main(args: Array[String]): Unit = {
        // 这里的myRunInThread就是一个控制抽象，它接收 一个没有输入、也没输出的函数 作为参数，
        // 即 传入函数的输入输出均为Unit，f1: () => Unit
        def myRunInThread(f1: () => Unit) = {
            new Thread {
                override def run(): Unit = {
                    f1()
                }
            }.start()
        }

        myRunInThread {
            () => {
                println("干活咯！2秒完成……")
                Thread.sleep(2000)
                println("干完啦")
            }
        }

        // 对于没有输入、也没输出的函数，可简写为以下形式
        def myRunInThread2(f2: => Unit) = {
            new Thread {
                override def run(): Unit = {
                    f2
                }
            }.start()
        }

        // 看起来就像是传入一段代码块，其实传入的是一个没有输入、也没输出的匿名函数，该匿名函数的函数体为这段代码块
        myRunInThread2 {
            println("干活咯！2秒完成~~")
            Thread.sleep(2000)
            println("干完啦~~")
        }
    }
}
