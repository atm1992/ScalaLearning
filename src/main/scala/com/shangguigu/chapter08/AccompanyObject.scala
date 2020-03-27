package com.shangguigu.chapter08

/**
 * Created by liuquan on 2020/3/5.
 */
object AccompanyObject {
    def main(args: Array[String]): Unit = {
        println(ScalaPerson.sex)
        ScalaPerson.sayHi
    }
}

// 伴生类
class ScalaPerson{
    var name:String = _
}

// 伴生对象
object ScalaPerson{
    var sex:Boolean = true

    def sayHi: Unit ={
        println("object ScalaPerson say Hi")
    }
}