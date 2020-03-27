package com.shangguigu.chapter16

/**
 * Created by liuquan on 2020/3/24.
 */
object Exercise2 {
    def main(args: Array[String]): Unit = {
        val a1 = Array(2, true, 'w', "hi")
        val a2 = Array(2, "hehe")

        println(a1.mkString(" "), swap(a1).mkString(" "))
        println(a2.toBuffer, swap(a2).toBuffer)
    }

    // 交换数组中前两个元素的位置
    def swap(arr: Array[Any]) = {
        arr match {
            case Array(first, second, rest@_*) => Array(second, first) ++ rest
            case _ => arr
        }
    }
}
