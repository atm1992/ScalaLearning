package com.imooc.scala.course04

/**
 * Created by liuquan on 2020/1/8.
 */
object CaseClassApp {
    def main(args: Array[String]): Unit = {
        println(Dog("wangcai").name)
    }
}

// case class 不需要new，直接使用就行
case class Dog(name:String)