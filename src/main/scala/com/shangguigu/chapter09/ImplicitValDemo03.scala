package com.shangguigu.chapter09

/**
 * Created by liuquan on 2020/3/13.
 */
object ImplicitValDemo03 {
    def main(args: Array[String]): Unit = {
        implicit var str1 = "Tom"       // 隐式值
        // implicit name:String 隐式形参
        def hello(implicit name:String): Unit ={
            println("hello " + name)
        }
        // 若要使用隐式值，则调用hello方法时，后面不要带()
        hello       // 底层字节码文件中对应的是hello$1(str1)。$1表示hello这个方法是定义在某方法内部的一个方法
    }
}
