package com.imooc.scala.course06

import scala.util.Random

/**
 * Created by liuquan on 2020/1/8.
 */
object MatchApp extends App{
//    val names = Array("zhangsan","lisi","wangwu")
//    val name = names(Random.nextInt(names.length))
//    name match {
//        case "zhangsan" => println("张三")
//        case "lisi" => println("李四")
//        case _ => println("dont know")
//    }
//
//    def judgeGrade(grade:String): Unit ={
//        grade match {
//            case "A" => println("excellent")
//            case "B" => println("good")
//            case "C" => println("just so so")
//            case _  => println("hurry up")
//        }
//    }
//
//    judgeGrade("A")
//    judgeGrade("C")
//    judgeGrade("D")

//    def judgeGrade(name:String,grade:String): Unit ={
//        grade match {
//            case "A" => println("excellent")
//            case "B" => println("good")
//            case "C" => println("just so so")
//            case _ if(name=="lisi") => println(name + " hurry up")
//            case _ => println(name + " hurry up")
//        }
//    }
//    judgeGrade("zhangsan","D")
//    judgeGrade("lisi","A")
//    judgeGrade("lisi","D")      // 双重过滤

//    def greeting(array:Array[String]): Unit ={
//        array match {
//            case Array("zhangsan") => println("Hi: zhangsan")
//            case Array(x,y) => println("Hi: "+ x+" , "+y)
//            case Array("zhangsan",_*) => println("Hi: zhangsan and others")
//            case _  => println("Hi everybody")
//        }
//    }
//    greeting(Array("zhangsan"))
//    greeting(Array("lisi","wangwu"))
//    greeting(Array("zhangsan","lisi","wangwu"))
//    greeting(Array("lisi","zhangsan","wangwu"))

//    def greeting(list: List[String]): Unit ={
//        list match {
//            case "zhangsan"::Nil => println("Hi: zhangsan")
//            case x::y::Nil => println("Hi: "+ x+" , "+y)
//            case "zhangsan"::tail => println("Hi: zhangsan and others")
//            case _  => println("Hi everybody")
//        }
//    }
//    greeting(List("zhangsan"))
//    greeting(List("lisi","wangwu"))
//    greeting(List("zhangsan","lisi","wangwu"))
//    greeting(List("lisi","zhangsan","wangwu"))

//    def matchType(obj:Any): Unit ={
//        obj match {
//            case x:Int => println("Int")
//            case s:String => println("String")
//            case m:Map[_,_] => m.foreach(println)
//            case _ => println("other type")
//        }
//    }
//    matchType(1)
//    matchType("aa")
//    matchType(1f)
//    matchType(Map("name"->"lq"))

//    这里传入的class需要是一个顶层的类，例如这里的Person类，case class都是Person的子类
    class Person
    case class CTO(name:String,floor:String) extends Person
    case class Employee(name:String,floor:String) extends Person
    case class Other(name:String) extends Person

    def caseClassMatch(person:Person): Unit ={
        person match {
            case CTO(name,floor) => println("CTO name is " + name + ", floor is "+ floor)
            case Employee(name,floor) => println("Employee name is " + name + ", floor is "+ floor)
            case _ => println("other")
        }
    }

    caseClassMatch(CTO("lq","13"))
    caseClassMatch(Employee("zhangsan","24"))
    caseClassMatch(Other("other"))

}
