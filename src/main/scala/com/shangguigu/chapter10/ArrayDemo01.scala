package com.shangguigu.chapter10

/**
 * Created by liuquan on 2020/3/18.
 */
object ArrayDemo01 {
    def main(args: Array[String]): Unit = {
        val arr01 = new Array[Int](4)
        println(arr01.length)

        println("arr01(1)= "+arr01(1))

        arr01.foreach(println)
        arr01(3)=4
        arr01.foreach(println)


        val arr02 = Array(1,3,"aa")
        arr02.foreach(println)
    }
}
