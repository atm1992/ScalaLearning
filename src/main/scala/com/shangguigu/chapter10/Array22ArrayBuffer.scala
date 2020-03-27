package com.shangguigu.chapter10

import scala.collection.mutable.ArrayBuffer

/**
 * Created by liuquan on 2020/3/18.
 */
object Array22ArrayBuffer {
    def main(args: Array[String]): Unit = {
        val arr1 = ArrayBuffer[Int]()
        arr1.append(2,3,5)
        println(arr1)

        val newArr = arr1.toArray
        println(newArr)

        val newArr2 = newArr.toBuffer
        newArr2.append(8)
        println(newArr2)
    }
}
