package com.shangguigu.chapter17.singleton

/**
 * Created by liuquan on 2020/3/25.
 */
object TestSingleTon2 extends App {
    val instance1 = SingleTon2.getInstance
    val instance2 = SingleTon2.getInstance
    println(instance1 == instance2) // true
}

// 将SingleTon2类的构造方法设置为private
// 保证SingleTon2类的实例对象只有一个
class SingleTon2 private {}

// 单例模式 - 饿汉式
object SingleTon2 {
    private val s: SingleTon2 = new SingleTon2

    def getInstance = {
        s
    }
}
