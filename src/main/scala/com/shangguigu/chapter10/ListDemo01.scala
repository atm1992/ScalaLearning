package com.shangguigu.chapter10

/**
 * Created by liuquan on 2020/3/18.
 */
object ListDemo01 {
    def main(args: Array[String]): Unit = {
        val list01 = List(1,2,3)
        println(list01)
        val list02 = Nil
        println(list02)

        val list03 = list01 :+ 4
        println(list03)
        val list04 = 5 +: list01
        println(list04)

        // :: 符号的使用
        val list05 = List(1,2,3)
        /**
         * 执行流程：从右向左执行，然后在List的头部增加元素
         * 1、Nil 创建一个空的List
         * 2、list05 :: 将list05作为一个元素插入到空List的头部
         * 3、5 :: 将5插入到头部
         * 4、4 :: 将4插入到头部
         */
        val list06 = 4 :: 5 :: list05 :: Nil        // List(4, 5, List(1, 2, 3))
        println(list06)
        val list07 = 4 :: 5 :: list05           // List(4, 5, 1, 2, 3)
        println(list07)

        /**
         * list05 ::: Nil 与 list05 :: Nil 的区别：
         * ::: 是将运算符左侧的list05打散，然后将其中的每个元素逐个加入到右侧的Nil中
         * :: 会将运算符左侧的list05作为一个整体加入到右侧的Nil中，变成其中的一个元素
         */
        val list08 = 4 :: 5 ::  list05 ::: Nil      // List(4, 5, 1, 2, 3)
        println(list08)
    }
}
