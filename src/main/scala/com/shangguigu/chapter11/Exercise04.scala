package com.shangguigu.chapter11

/**
 * Created by liuquan on 2020/3/20.
 */
object Exercise04 {
    def main(args: Array[String]): Unit = {     // wordcount
        val lines = List("atguigu han hello ", "atguigu han aaa aaa aaa ccc ddd uuu")
        val res = lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.size).toList.sortBy(_._2).reverse
        println(res)        // List((aaa,3), (atguigu,2), (han,2), (hello,1), (uuu,1), (ccc,1), (ddd,1))
    }
}
