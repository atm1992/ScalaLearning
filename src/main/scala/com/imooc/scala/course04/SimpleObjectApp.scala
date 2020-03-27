package com.imooc.scala.course04

/**
 * Created by liuquan on 2020/1/7.
 */
object SimpleObjectApp {
    def main(args: Array[String]): Unit = {
        val person = new People()
        person.name="Messi"
        println(person.name+" .. " + person.age)
        println("invoke eat method :"+person.eat)   // 因为eat()没有形参，所以方法名后面的括号可以不写
        person.watchFootball("Barcelona")

        person.printInfo()
    }
}

class People{
    // 定义属性
    var name:String=_      // 针对变量，Scala会自动生成getter和setter。 _ 是一个占位符
    val age=10          // 针对常量，Scala会自动生成getter，但不会有setter
    
    private[this] val gender = "male"
    
    def printInfo(): Unit ={
        println("gender: "+gender)
    }

    // 定义方法
    def eat():String={
        name + " eat……"
    }

    def watchFootball(teamName:String): Unit ={
        println(name+" is watching match of "+teamName)
    }
}