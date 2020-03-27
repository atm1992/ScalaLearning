package com.shangguigu.chapter10

import scala.collection.mutable.ArrayBuffer

/**
 * Created by liuquan on 2020/3/18.
 */
object ArrayBuffer2JavaList {
    def main(args: Array[String]): Unit = {
        // Scala数组转换成Java List
        import scala.collection.mutable.ArrayBuffer
        val arr = ArrayBuffer[String]("1", "2", "3")
        // bufferAsJavaList 是一个隐式函数，可以自动将ArrayBuffer转换成Java List
        import scala.collection.JavaConversions.bufferAsJavaList
        // 这里的arr会先自动转换成Java List，然后传入给ProcessBuilder
        val javaArr = new ProcessBuilder(arr)
        val arrList = javaArr.command()
        println(arrList)    // 输出 [1, 2, 3]


        // Java List转换成Scala数组(mutable.Buffer)
        // asScalaBuffer也是一个隐式函数，可以自动将Java List转换成Scala Buffer
        import scala.collection.JavaConversions.asScalaBuffer
        import scala.collection.mutable.Buffer
        // 在赋值时触发隐式函数的调用，自动将Java List转换成Scala Buffer
        val scalaArr: Buffer[String] = arrList
        scalaArr.append("jack")
        println(scalaArr)   // 输出 ArrayBuffer(1, 2, 3, jack)
    }
}

