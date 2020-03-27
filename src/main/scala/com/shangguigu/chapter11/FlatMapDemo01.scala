package com.shangguigu.chapter11

/**
 * Created by liuquan on 2020/3/19.
 */
object FlatMapDemo01 {
    def main(args: Array[String]): Unit = {
        val name = List("Alice", "Bob","Nick")
//        val mapName = name.map(upperCase)
//        println(mapName)        // List(ALICE, BOB, NICK)
        val flatName = name.flatMap(upperCase)
        println(flatName)       // List(A, L, I, C, E, B, O, B, N, I, C, K)
    }

    def upperCase(inStr:String):String={
        inStr.toUpperCase
    }
}
