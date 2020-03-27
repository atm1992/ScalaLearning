package com.shangguigu.chapter04.break_continue

import util.control.Breaks._

/**
 * Created by liuquan on 2020/3/2.
 * 100 以内的数求和，求出当和第一次大于20 的当前数
 */
object Exercise01 {
    def main(args: Array[String]): Unit = {
        var sum = 0
        breakable {
            for (i <- 1 to 100) {
                sum += i
                if (sum > 20) {
                    println("i=" + i + "\tsum=" + sum)
                    break
                }
            }
        }
    }
}
