package com.shangguigu.chapter10

import scala.collection.mutable.ArrayBuffer


/**
 * Created by liuquan on 2020/3/18.
 */
object ArrayBufferDemo01 {
    def main(args: Array[String]): Unit = {
        val arr01 = ArrayBuffer[Any](2,3,5)
        println("arr01(2)= "+arr01(2))
        arr01.foreach(println)
        println("arr01.hashCode= "+arr01.hashCode())
        arr01.append("sr")
        println("arr01.hashCode= "+arr01.hashCode())

        arr01(2)="fr"
        arr01.foreach(println)
        arr01.remove(1)
        arr01.foreach(println)
    }
}
