package com.shangguigu.chapter06.constructor

/**
 * Created by liuquan on 2020/3/3.
 */
object ConDemo01 {
    def main(args: Array[String]): Unit = {
        // 这里调用的是主构造器
        // 输出的是：主构造器；name=Tom	 age=18
        val p1 = new Person("Tom", 18)
        println(p1)

        // 这里调用的是第一个辅助构造器
        // 输出的是：主构造器；第一个辅助构造器；name=Lily	 age=20
        val p2 = new Person("Lily")
        println(p2)

        // 这里调用的是第二个辅助构造器
        // 输出的是：主构造器；第一个辅助构造器；第二个辅助构造器；name=Robin	 age=28
        val p3 = new Person(28)
        println(p3)
    }
}

// 注意：构造器中的形参名不能与属性名相同，会报错显示该名字在作用域中已定义
// class Person private(inName: String, inAge: Int) { ，将主构造器变成私有的
class Person (inName: String, inAge: Int) { // 主构造器
    var name: String = inName
    var age: Int = inAge

    // 重写toString方法，便于输出对象的信息
    override def toString: String = {
        "name=" + this.name + "\t age=" + this.age
    }

    // 除了方法def声明以外的所有语句都会在主构造器内执行。
    // 下面这行代码是在主构造器内执行，即 新建对象的时候就会执行
    println("主构造器")

    // 第一个辅助构造器
    def this(name: String) {
        // 辅助构造器在定义时，必须在第一行显式调用主构造器(可以是直接调用，也可以是间接调用)
        // 这里是直接调用主构造器
        this("Jack", 20)
        this.name = name
        println("第一个辅助构造器")
    }

    // 第二个辅助构造器
    // private def this(age: Int) { ，将辅助构造器变成私有的
    def this(age: Int) {
        // 这里通过调用第一个辅助构造器来间接调用主构造器
        this("Robin")
        this.age = age
        println("第二个辅助构造器")
    }
}