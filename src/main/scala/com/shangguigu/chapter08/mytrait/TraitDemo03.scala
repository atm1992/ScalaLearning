package com.shangguigu.chapter08.mytrait

/**
 * Created by liuquan on 2020/3/5.
 */
object TraitDemo03 {
    def main(args: Array[String]): Unit = {
        val s1 = new Sheep
        s1.sayHi()
        s1.sayHello()
    }
}


trait Trait03 {
    // 抽象方法
    def sayHi()

    // 普通方法
    def sayHello(): Unit = {
        println("sayHello ~")
    }
}

class Sheep extends Trait03 {
    // override 可写可不写
    override def sayHi(): Unit = {
        println("sheep say Hi")
    }
}