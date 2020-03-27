package com.shangguigu.chapter12

/**
 * Created by liuquan on 2020/3/20.
 */
object MatchIfDemo01 {
    def main(args: Array[String]): Unit = {
        for (ch <- "+-3!") {
            var sign = 0
            var digit = 0
            ch match {
                case '+' => sign = 1
                case '-' => sign = -1
                case _ if ch.toString.equals("3") => digit = 3
                case _ => sign = 2
            }
            println(ch + " " + sign + " " + digit)
        }
    }
}
