package com.shangguigu.chapter08.mytrait

/**
 * Created by liuquan on 2020/3/5.
 */
object TraitDemo02 {
    def main(args: Array[String]): Unit = {
        val c = new C()
        val e = new E()
        c.getConnect()  // 连接mysql数据库...
        e.getConnect()  // 连接oracle数据库...
    }
}

// 按要求定义一个trait
trait Trait01 {
    // 定义一个规范
    def getConnect()
}

class A {}

class B extends A {}

class C extends A with Trait01 {
    override def getConnect(): Unit = {
        println("连接mysql数据库...")
    }
}

class D {}

class E extends D with Trait01 {
    override def getConnect(): Unit = {
        println("连接oracle数据库...")
    }
}

class F extends D {}
