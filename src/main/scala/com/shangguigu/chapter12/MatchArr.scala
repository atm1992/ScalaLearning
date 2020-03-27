package com.shangguigu.chapter12

import scala.collection.mutable.ArrayBuffer

/**
 * Created by liuquan on 2020/3/20.
 */
object MatchArr {
    def main(args: Array[String]): Unit = {
        val arrs = Array(Array(0), Array(2, 3), Array(4, 5, 6), Array(0, 1, 0))
        for (arr <- arrs) {
            val result = arr match {
                case Array(0) => "0"
                case Array(x, y) => x + "=" + y
//                 case Array(x,y) => ArrayBuffer(y,x)        // 将数组的两个元素交换位置
                case Array(0, _*) => "以0开头的数组"
                case _ => "什么集合都不是"
            }
            println(result)
        }
    }
}
