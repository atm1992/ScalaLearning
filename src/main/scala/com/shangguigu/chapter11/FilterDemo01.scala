package com.shangguigu.chapter11

import scala.collection.mutable.ListBuffer

/**
 * Created by liuquan on 2020/3/19.
 */
object FilterDemo01 {
    def main(args: Array[String]): Unit = {
        val name = List("Alice", "Bob", "Nick")
        val filterName = name.filter(startA)
        println("使用filter高阶函数：" + filterName)

        val traditionalName = filterStartA(name)
        println("使用传统方法：" + traditionalName)
    }

    def startA(inStr: String): Boolean = {
        inStr.startsWith("A")
    }

    // 传统方法
    def filterStartA(li: List[String]): List[String] = {
        val res = new ListBuffer[String]
        for (item <- li) {
            if (item.startsWith("A")) {
                res += item
            }
        }
        res.toList
    }
}
