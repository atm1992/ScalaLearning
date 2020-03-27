package com.shangguigu.chapter11

/**
 * Created by liuquan on 2020/3/19.
 */
object Exercise01 {
    def main(args: Array[String]): Unit = {
        val name = List("Alice","Bob","Nick")
        val upName = name.map(upperCase)
        println(upName)
    }

    def upperCase(inStr:String):String={
        inStr.toUpperCase
    }
}
