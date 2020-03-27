package com.shangguigu.chapter09

/**
 * Created by liuquan on 2020/3/13.
 */
object ImplicitClassDemo {
    def main(args: Array[String]): Unit = {
        // DB1是一个隐式类，若在隐式类的作用域内创建了一个MySQL1类的对象，则该隐式类便会生效，这个工作仍由编译器完成
        implicit class DB1(val m: MySQL1) {
            def addSuffix: String = {
                m + " Scala"
            }
        }
        val mySql = new MySQL1
        mySql.sayOk
        // DB1$1(mySql).addSuffix()。相当于将mySql对象传入DB1类的构造器，然后返回一个DB1类的对象，从而可以调用addSuffix方法
        println(mySql.addSuffix)

        implicit def f1(d:Double):Int={
            d.toInt

            // 语法报错。因为底层对应的是f1(5.6)，从而形成递归死循环
//            val num1:Int = 5.6
        }

        def test(n1:Int): Unit ={
            println("ok")
        }

        test(2.2)
    }
}

class MySQL1 {
    def sayOk: Unit = {
        println("sayOk")
    }
}
