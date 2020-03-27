package com.shangguigu.chapter09

/**
 * Created by liuquan on 2020/3/13.
 */
object ImplicitValDemo04 {
    def main(args: Array[String]): Unit = {
        implicit var str1: String = "Tom"

        // implicit content:String = "Jack" 这里表示默认值
        // 可理解为content是一个隐式形参，然后给该形参赋了一个默认值"Jack"
        def hello(implicit content: String = "Jack"): Unit = {
            println("hello " + content)
        }
        def getSal(implicit sal: Double): Unit = {
            println("sal is " + sal)
        }

        hello       // hello Tom。隐式值
        hello()     // hello Jack。默认值
        hello("Lily")   // hello Lily。显式传值

//        getSal      // 未传入参数导致报错。虽然存在隐式值，但不是隐式形参要求的Double类型
    }
}
