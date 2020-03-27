package com.shangguigu.chapter11

/**
 * Created by liuquan on 2020/3/20.
 */
object ParDemo01 {
    def main(args: Array[String]): Unit = {
        (1 to 5).foreach(println)           // 输出结果有序
        (1 to 5).par.foreach(println)       // 这里输出的结果是无序的，说明将println任务分配给了不同的处理器去执行，有的快、有的慢，从而导致输出结果无序

        // 查看元素访问时的线程名
        val result1 = (0 to 100).map{case _ => Thread.currentThread.getName}.distinct
        val result2 = (0 to 100).par.map{case _ => Thread.currentThread.getName}.distinct
        println("非并行集合 " + result1)        // 始终只有一个main线程
        println("并行集合 " + result2)          // 可以看到有12个线程。本机6核12线程(因为使用了超线程技术)
    }
}
