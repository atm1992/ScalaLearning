package com.shangguigu.chapter07

import java.util.{HashMap => JavaHashMap}
import collection.mutable.{HashMap => ScalaHashMap}

/**
 * Created by liuquan on 2020/3/4.
 */

// 继承了trait App之后，便可以直接在这个类中执行代码，不需要再写main函数入口
object CopyHashMap extends App {
    val javaMap = new JavaHashMap[Int, String]()
    javaMap.put(1, "one")
    javaMap.put(2, "two")
    javaMap.put(3, "three")
    javaMap.put(4, "four")
    val scalaMap = new ScalaHashMap[Int, String]()
    //    javaMap.keySet().toArray.foreach(println)
    for (key <- javaMap.keySet().toArray()) {
        scalaMap += (key.asInstanceOf[Int] -> javaMap.get(key))
    }
    // 将scalaMap中的元素逐个取出来，用" "间隔，返回的是一个字符串
    println(scalaMap.mkString(" "))
}
