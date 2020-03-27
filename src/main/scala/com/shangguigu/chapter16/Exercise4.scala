package com.shangguigu.chapter16

import scala.math.sqrt

/**
 * Created by liuquan on 2020/3/24.
 */
object Exercise4 {
    def main(args: Array[String]): Unit = {
        def f(x: Double) = if (x > 0) Some(sqrt(x)) else None

        def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None

        // 案例：执行h(2)得到的是Some(1)，而执行h(1)或h(0)得到的是None
        // 对上面给出的案例进行分析发现，h(2)的执行结果Some(1)是由g(2)得到的，因为f(2) = 根号二
        val h = compose(f, g)       // 变量h指向返回的匿名函数
        println("h(0)= " + h(0))
        println("h(1)= " + h(1))
        println("h(2)= " + h(2))
    }

    // 将两个类型为 Double => Option[Double] 的函数组合成另一个同类型的函数。若其中一个函数返回None，则组合函数也返回None
    def compose(f: Double => Option[Double], g: Double => Option[Double]) = {
        // 返回一个匿名函数。即 闭包
        x: Double => {
            if (f(x) == None || g(x) == None) None
            else g(x)
        }
    }
}
