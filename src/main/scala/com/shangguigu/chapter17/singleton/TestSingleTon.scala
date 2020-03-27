package com.shangguigu.chapter17.singleton

/**
 * Created by liuquan on 2020/3/25.
 */
object TestSingleTon extends App {
    val instance1 = SingleTon.getInstance
    val instance2 = SingleTon.getInstance
    println(instance1 == instance2) // true
}

// 将SingleTon类的构造方法设置为private
// 保证SingleTon类的实例对象只有一个
class SingleTon private {}

// 单例模式 - 懒汉式
object SingleTon {
    private var s: SingleTon = null

    def getInstance = {
        if (s == null) {
            s = new SingleTon
        }
        s
    }
}