package com.shangguigu.chapter08.mixin

/**
 * Created by liuquan on 2020/3/7.
 */
object SelfTypeDemo {
    def main(args: Array[String]): Unit = {

    }
}

// 特质Logger是一个自身类型特质，自身类型为Exception (this:Exception =>)，有点相当于trait Logger extends Exception，
// (this:Exception =>) 这种语法是为了给编译器进行说明，该特质是Exception类型，
// this:Exception => 这种方式比 extends Exception 方式的要求更加严格，它要求混入该特质的类也必须是Exception的子类，
// 而 extends Exception 对混入该特质的类的类型没有要求。
trait Logger {
    this: Exception =>
    def log: Unit = {
        // 因为特质Logger的类型指明了是Exception，所以这里可以调用getMessage方法
        println(getMessage)
    }
}

// 由于Console1不是Exception的子类，所以不能混入特质Logger，语法报错非法继承
//class Console1 extends Logger {}

// Console2是Exception的子类，所以可以混入特质Logger
class Console2 extends Exception with Logger {}