package com.shangguigu.chapter11

import scala.collection.mutable.ArrayBuffer

/**
 * Created by liuquan on 2020/3/20.
 * 将 sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD" 中的各个字符，通过foldLeft存放到一个ArrayBuffer中
 */
object Exercise02 {
    def main(args: Array[String]): Unit = {
        val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
        val res = new ArrayBuffer[Char]()
        // 将结果不断折叠到res中
        sentence.foldLeft(res)(putArray)
        println(res)    // ArrayBuffer(A, A, A, A, A, A, A, A, A, A, B, B, B, B, B, B, B, B, C, C, C, C, C, D, D, D, D, D, D, D)
    }

    def putArray(arr: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
        arr.append(c)
        arr
    }
}
