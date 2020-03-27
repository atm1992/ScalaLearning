package com.shangguigu.chapter10

/**
 * Created by liuquan on 2020/3/18.
 */
object MultiArray {
    def main(args: Array[String]): Unit = {
        val arr = Array.ofDim[Double](3, 4)
        for (item <- arr) { // item是一维数组
            for (i <- item) {
                print(i + "\t")
            }
            println()
        }

        arr(2)(1)=4.5
        println(arr(2)(1))
    }
}
