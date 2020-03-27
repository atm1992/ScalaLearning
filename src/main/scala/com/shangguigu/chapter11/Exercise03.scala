package com.shangguigu.chapter11

import scala.collection.mutable

/**
 * Created by liuquan on 2020/3/20.
 */
object Exercise03 {
    def main(args: Array[String]): Unit = {     // WordCount
        val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"

        val res1 = sentence.foldLeft(Map[Char, Int]())(charCount1)
        println("使用不可变Map：" + res1)     // Map(A -> 10, B -> 8, C -> 5, D -> 7)

        val res2 = mutable.Map[Char, Int]() // 这里使用可变Map，效率更高
        sentence.foldLeft(res2)(charCount2)
        println("使用可变Map：" + res2)      // Map(D -> 7, A -> 10, C -> 5, B -> 8)，可变Map是无序的
    }

    def charCount1(charMap: Map[Char, Int], c: Char): Map[Char, Int] = {
        charMap + (c -> (charMap.getOrElse(c, 0) + 1))      // 这里是不可变Map，每次返回一个新的Map，效率较低
    }

    def charCount2(charMap: mutable.Map[Char, Int], c: Char): mutable.Map[Char, Int] = {
        charMap += (c -> (charMap.getOrElse(c, 0) + 1))     // 这里是可变Map，效率更高
    }
}
