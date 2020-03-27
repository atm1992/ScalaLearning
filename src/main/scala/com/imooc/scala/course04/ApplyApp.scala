package com.imooc.scala.course04

/**
 * Created by liuquan on 2020/1/8.
 */
object ApplyApp {
    def main(args: Array[String]): Unit = {
//        for(i <- 1 to 10){
//            ApplyTest.incr
//        }
//        println(ApplyTest.count)        // 说明伴生对象是一个单例对象

        val b = ApplyTest()     // 调用的是伴生对象中的apply方法

        println("------------------------")
        val c= new ApplyTest()
        println(c)
        c()         // 调用的是伴生类中的apply方法
    }
}

// class ApplyTest 是 object ApplyTest 的伴生类
class ApplyTest{
    def apply(): Unit ={
        println("class ApplyTest apply ...")
    }
}

// object ApplyTest 是 class ApplyTest 的伴生对象
object ApplyTest{
    println("object ApplyTest enter ...")
    var count=0
    def incr: Unit ={
        count+=1
    }
    // 最佳实践：在object伴生对象的apply方法中去 new 一个 class伴生类
    def apply(): ApplyTest ={
        println("object ApplyTest apply ...")
//        在伴生对象中的apply中 new 一个伴生类
        new ApplyTest
    }

    println("object ApplyTest leave ...")
}