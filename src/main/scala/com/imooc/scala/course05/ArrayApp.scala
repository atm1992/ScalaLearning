package com.imooc.scala.course05

/**
 * Created by liuquan on 2020/1/8.
 */
object ArrayApp extends App{
    val a = new Array[String](5)
//    a.length
//    a(1)="hello"
//    val b = Array("hadoop","spark","scala")
//    val c = Array(2,3,4,5,6,7,8,9)
//    c.sum
//    c.min
//    c.max
//    c.mkString(",")

    val d = scala.collection.mutable.ArrayBuffer[Int]()
    d +=1
    d+=(2,3,4,5)
    d++=Array(6,7,8)
    d.insert(0,0)
    d.remove(1)
    d.remove(0,3)
    d.trimEnd(2)
//    for(i <- 0.until(d.length)){
//        println(d(i))
//    }

////    通常使用这种方式打印集合元素
//    for(ele<-d){
//        println(ele)
//    }

//    逆序输出集合元素
    for(i <- 0.until(d.length).reverse){
        println(d(i))
    }
//    println(d.toArray.mkString)
    Nil
}
