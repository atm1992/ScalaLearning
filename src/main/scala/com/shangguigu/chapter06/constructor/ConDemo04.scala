package com.shangguigu.chapter06.constructor

/**
 * Created by liuquan on 2020/3/3.
 */
object ConDemo04 {
    def main(args: Array[String]): Unit = {
        val w1 = new Worker1("Tom")
        w1.name
        // w1.inName        // 不能访问inName

        val w2 = new Worker2("Jack")
        println("w2.inName: " + w2.inName)          // 可以访问inName，但不能修改
        // w2.inName = "Jack_2"

        val w3 = new Worker3("Lily")
        println("w3.inName: " + w3.inName)
        w3.inName = "Lily_2"        // 可以访问inName，并且还能修改
        println("w3.inName new: " + w3.inName)
    }
}

// 主构造器的形参inName未用任何修饰符修饰，因此inName这个参数是局部变量，不可读写
class Worker1(inName: String) {
    var name = inName
}

// 主构造器的形参inName使用val关键字声明，则inName这个参数将作为类的私有只读属性，可读不可写
class Worker2(val inName: String) {
    var name = inName
}

// 主构造器的形参inName使用var关键字声明，则inName这个参数将作为类的成员属性，可读可写
// 该成员属性也是私有的，但提供了public的的xxx()[类似getter]/xxx_$eq()[类似setter]方法
class Worker3(var inName: String) {
    var name = inName
}