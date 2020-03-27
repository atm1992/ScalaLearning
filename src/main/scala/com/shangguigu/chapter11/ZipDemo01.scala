package com.shangguigu.chapter11

/**
 * Created by liuquan on 2020/3/20.
 */
object ZipDemo01 {
    def main(args: Array[String]): Unit = {
        val list1 = List(1, 2, 3)
        val list2 = List(4, 5, 6)
        val res = list1.zip(list2)
        println(res)    // List((1,4), (2,5), (3,6))

        val list3 = List(1, 2, 3)
        val list4 = List(4)
        println(list3.zip(list4)) // List((1,4))，造成数据丢失

        for (item <- res) {
            println(item._1 + " " + item._2)
        }
    }
}
