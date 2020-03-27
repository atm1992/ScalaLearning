package com.shangguigu.chapter10

/**
 * Created by liuquan on 2020/3/18.
 * 运算符重载
 */
object OperatorOverload {
    def main(args: Array[String]): Unit = {
        val cat = new Cat
        cat+10
        cat+20
        cat.+(50)
        println(cat.age)
    }
}

class Cat{
    var age = 0
    def +(n:Int): Unit ={
        this.age+=n
    }
}