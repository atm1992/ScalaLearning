package com.shangguigu.chapter04.break_continue

/**
 * Created by liuquan on 2020/3/2.
 */
object LoopContinue {
    def main(args: Array[String]): Unit = {
        for (i <- 1 to 5 if i != 2 && i != 4) {
            println("i=" + i) // 输出 1、3、5
        }

        // 与上一种方式等价
        for (i <- 1 to 5) {
            if (i != 2 && i != 4) {
                println("i=" + i)
            }
        }
    }
}
