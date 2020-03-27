package com.shangguigu.chapter06

import scala.beans.BeanProperty

/**
 * Created by liuquan on 2020/3/4.
 */
object BeanPropertyDemo {
    def main(args: Array[String]): Unit = {
        val c1 = new Car
        // 原来自动在字节码文件中生成的xxx(),xxx_$eq()方法依旧可用
        c1.name = "小白"
        println("c1.name: " + c1.name)

        // 在属性声明前加上 @BeanProperty，自动生成的setXxx/getXxx方法
        c1.setName("小黑")
        println("c1.getName: " + c1.getName)
    }
}

class Car {
    @BeanProperty var name: String = _
}