package com.shangguigu.chapter13

/**
 * Created by liuquan on 2020/3/22.
 */
object HigherOrderFunction {
    def main(args: Array[String]): Unit = {
        def test(f1: Double => Double, f2: Double => Int, n1: Double) = {
            f1(f2(n1))
        }

        def mod(d: Double): Int = {
            d.toInt % 2
        }

        def sum(d: Double): Double = {
            d + d
        }

        val res = test(sum, mod, 7)
        println("res= " + res)      // res= 2.0
    }
}
