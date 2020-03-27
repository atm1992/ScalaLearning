package com.shangguigu.chapter04.whileloop

/**
 * Created by liuquan on 2020/3/2.
 */
object Demo01 {
    def main(args: Array[String]): Unit = {
        // 在while循环外部定义循环变量
        var i = 0
        // 循环条件
        while (i < 5) {
            // 循环体
            println(i)
            // 循环变量迭代
            i += 1
        }
        // 在循环外部定义循环变量
        var j = 0
        do {
            // 循环体
            println(j)
            // 循环变量迭代
            j += 1
        } while (j < 5)     // 循环条件
    }
}
