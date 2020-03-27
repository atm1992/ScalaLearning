package com.shangguigu.chapter10

import scala.collection.mutable

/**
 * Created by liuquan on 2020/3/19.
 */
object SetDemo01 {
    def main(args: Array[String]): Unit = {
        val set1 = Set(1, 2, "world") // 不可变
        println(set1)

        val mutableSet = mutable.Set[Int](1, 2) // 可变
        // 添加元素
        mutableSet.add(3)
//        mutableSet.add(4, 5) // 这里添加的是元组(4,5)，前提是mutableSet的类型为Any
        mutableSet += 6
        mutableSet += (6) // 添加重复元素并不会报错
        mutableSet += (7, 8) // 这里添加的是两个元素7, 8
        println(mutableSet)

        // 删除元素
        mutableSet.remove(3)
//        mutableSet.remove(4, 5) // 这里指的是删除元组(4,5)
        mutableSet -= 6
        mutableSet -= 9 // 删除不存在的元素并不会报错
        mutableSet -= (7, 8) // 一次性删除多个元素
        println(mutableSet)

        for (x <- mutableSet) {
            println(x)
        }

        println(mutableSet.min)
    }
}
