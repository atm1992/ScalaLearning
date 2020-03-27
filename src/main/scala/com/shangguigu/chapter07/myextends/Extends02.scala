package com.shangguigu.chapter07.myextends

/**
 * Created by liuquan on 2020/3/4.
 */
//1. 在scala 中，子类继承了父类的所有属性
//2. 但是private 的属性和方法无法访问
object Extends02 {
    def main(args: Array[String]): Unit = {
        val sub = new Sub()
        sub.sayOk()
    }
}

//父类(基类)
class Base {
    var n1: Int = 1 //public n1() , public n1_$eq()
    protected var n2: Int = 2
    private var n3: Int = 3 // private n3() , private n3_$eq()
    def test100(): Unit = { // 默认public test100()
        println("base 100")
    }

    protected def test200(): Unit = { // ？
        println("base 200")
    }

    private def test300(): Unit = { //private
        println("base 300")
    }
}

//Sub 继承Base
class Sub extends Base {
    def sayOk(): Unit = {
        this.n1 = 20 //这里访问本质this.n1_$eq()
        this.n2 = 40
        println("范围" + this.n1 + this.n2)
        test100() //
        test200() //
    }
}

