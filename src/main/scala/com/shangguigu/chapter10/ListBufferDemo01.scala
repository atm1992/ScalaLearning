package com.shangguigu.chapter10

import scala.collection.mutable.ListBuffer

/**
 * Created by liuquan on 2020/3/18.
 */
object ListBufferDemo01 {
    def main(args: Array[String]): Unit = {
        val list0 = ListBuffer[Int](1, 2, 3)
        list0.foreach(println) // 因为是Sequence，所以遍历是有序的

        // 向list1中动态增加元素
        val list1 = new ListBuffer[Int]
        list1 += 4
        list1.append(5, 6)

//        list0 ++= list1 // list0变为ListBuffer(1, 2, 3, 4, 5, 6)
        println(list0)
        val list2 = list0 ++ list1
        println(list0)
        println(list2)
        val list3 = list0 :+ 5
        println(list3)
        println(list1)
        println(list1.remove(1))
    }
}
