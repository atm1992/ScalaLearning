package com.shangguigu.chapter11

/**
 * Created by liuquan on 2020/3/19.
 */
object ReduceExercise01 {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4, 5)

        def minus(n1: Int, n2: Int): Int = {
            n1 - n2
        }

        println(list.reduceLeft(minus)) // (((1 - 2) - 3) - 4) - 5 = -13
        println(list.reduceRight(minus)) // 1 - (2 - (3 - (4 - 5))) = 3
        println(list.reduce(minus)) // reduce底层调用的就是reduceLeft，所以返回结果也是 -13

        val list2 = List(3, 4, 2, 7, 5)

        def min(n1: Int, n2: Int): Int = {
            if (n1 <= n2) n1 else n2
        }

        println("最小值为：" + list2.reduce(min))
    }
}
