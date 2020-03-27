package com.shangguigu.chapter13

/**
 * 比较两个字符串在忽略大小写的情况下是否相等，这里其实是两个任务：
 * 1) 全部转大写（或小写）
 * 2) 比较是否相等
 * 使用函数柯里化的思想将这两个任务分别进行处理
 */
object CurryDemo02 {
    def main(args: Array[String]): Unit = {
        val str1 = "hello"
        val str2 = "HELLO"

        println(eq1(str1)(str2)) // true 。使用一个函数的方式

        println(str1.checkEq(str2)(eq2)) // true 。使用两个函数的方式
        println(str1.checkEq(str2)(_.equals(_))) // true 。后面的匿名函数 _.equals(_) 其实就是函数eq2的简写形式
    }

    // 使用一个函数的方式来处理
    def eq1(s1: String)(s2: String) = {
        s1.toLowerCase == s2.toLowerCase
    }

    // 使用两个函数的方式来处理，每个函数分别处理一个任务。这里还用到了隐式类
    // 隐式类中的函数checkEq 负责将所有字符转换为小写
    // 函数eq2 负责比较两个字符串是否相等
    def eq2(s1: String, s2: String) = {
        s1.equals(s2)
    }

    // 隐式类
    implicit class TestEq(s1: String) {
        def checkEq(s2: String)(f: (String, String) => Boolean) = {
            f(s1.toLowerCase, s2.toLowerCase)
        }
    }

}
