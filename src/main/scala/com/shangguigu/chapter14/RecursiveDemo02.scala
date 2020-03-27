package com.shangguigu.chapter14

/**
 * Created by liuquan on 2020/3/22.
 * 求列表中的最大值
 */
object RecursiveDemo02 {
    def main(args: Array[String]): Unit = {
//        println(getMax(List()))
        println(getMax(List(2)))
        println(getMax(List(2,5,7,3,0)))
    }

    // 使用递归求列表中的最大值
    def getMax(xs: List[Int]): Int = {
        if (xs.isEmpty) throw new java.util.NoSuchElementException
        if (xs.size == 1) return xs.head
        if (xs.head >= getMax(xs.tail)) xs.head else getMax(xs.tail)
    }
}
