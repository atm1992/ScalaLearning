package com.shangguigu.chapter16

/**
 * Created by liuquan on 2020/3/24.
 */
object Exercise1 {
    def main(args: Array[String]): Unit = {
        val t1 = (2, 4)
        val t2 = ('w', "hello")
        val t3 = (true, 5.7)

        println(t1, swap(t1))
        println(t2, swap(t2))
        println(t3, swap(t3))
    }
    // 交换一个对偶元组中两个元素的位置
    def swap[T, S](tuple: (T, S)) = {
        tuple match {
            case (a, b) => (b, a)
        }
    }
}
