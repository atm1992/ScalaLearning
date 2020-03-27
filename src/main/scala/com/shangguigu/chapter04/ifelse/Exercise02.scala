package com.shangguigu.chapter04.ifelse

import scala.math.sqrt

/**
 * Created by liuquan on 2020/3/1.
 *
 * 求ax2+bx+c=0 方程的根。a,b,c 分别为函数的参数，如果：b2-4ac>0，则有两个解；
 * b2-4ac=0，则有一个解；b2-4ac<0，则无解； [a=3 b=100 c=6]
 * 提示1：x1=(-b+sqrt(b2-4ac))/2a
 * X2=(-b-sqrt(b2-4ac))/2a
 * 提示2：sqrt(num) 在scala 包中(默认引入的) 的math 的包对象有很多方法直接可用.
 */
object Exercise02 {
    def main(args: Array[String]): Unit = {
        val a = 2
        val b = 4
        val c = 2
        var x1 = 0.0
        var x2 = 0.0
        val m = b * b - 4 * a * c
        if (m > 0) {
            x1 = (-b + sqrt(m)) / (2 * a)
            x2 = (-b - sqrt(m)) / (2 * a)
            printf("有两个解：x1=%.2f x2=%.2f", x1, x2)
        } else if (m == 0) {
            x1 = -b / (2 * a)
            printf("只有一个解：x1=%.2f", x1)
        } else {
            println("无解...")
        }
    }
}
