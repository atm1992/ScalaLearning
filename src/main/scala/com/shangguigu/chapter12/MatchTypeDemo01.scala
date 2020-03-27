package com.shangguigu.chapter12

/**
 * Created by liuquan on 2020/3/20.
 */
object MatchTypeDemo01 {
    def main(args: Array[String]): Unit = {
        val a = 1
        // 根据a的值来确定obj的值，从而可以得到obj的数据类型
        val obj = if (a == 1) 10
        else if (a == 2) "2"
        else if (a == 3) BigInt(3)
        else if (a == 4) Map("aa" -> 1)
        else if (a == 5) Map(1 -> "aa")
        else if (a == 6) Array(1, 2, 3)
        else if (a == 7) Array("aa", 1)
        else if (a == 8) Array("aa")

        // 根据obj的数据类型来进行匹配，然后得到返回结果
        // 这里的 case a 中的a是一个变量，表示将obj的值赋给该变量，前提是obj的数据类型与变量a的数据类型匹配
        val result = obj match {
            case a: Int => a      // 这里将返回变量a的值
            case b: Map[String, Int] => "对象是一个字符串-数字的Map集合"
            case c: Map[Int, String] => "对象是一个数字-字符串的Map集合"
            case _: Array[String] => "对象是一个字符串数组"
            case _: Array[Int] => "对象是一个数字数组"
            case _: BigInt => Int.MaxValue      // 这里的 _ 不是表示默认匹配，而是指隐藏变量名，该变量在之后不需要使用
            case _ => "啥也不是"
        }
        println(result)
    }
}
