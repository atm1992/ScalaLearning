package com.imooc.scala.course04

/**
 * Created by liuquan on 2020/1/7.
 */
object ConstructorApp {
    def main(args: Array[String]): Unit = {
//        这里调用的是主构造器
//        val person = new Person("zhangsan",30)
//        println(person.name+" : "+person.age+" : "+person.school)
//
////        这里调用的是附属构造器
//        val person2 = new Person("lq",28,"M")
//        println(person2.name+" : "+person2.age
//            +" : "+person2.school+" : "+person2.gender)
        val student = new Student("lq",27,"math")
        println(student.name+" : "+ student.major)

        println(student)     // 这里等价于student.toString
    }
}

// 主构造器。跟在class定义后面的括号内，必须要写val或者var
class Person(val name:String,val age:Int){
    println("person constructor enter ...")
    val school = "buaa"
    var gender:String = _

//    附属构造器
    def this(name:String,age:Int,gender:String){
        this(name,age)   // 附属构造器的第一行代码必须要调用主构造器或者其它附属构造器。这里是使用this来调用主构造器
        this.gender = gender
    }
    println("person constructor leave ...")
}

class Student(name:String,age:Int,var major:String) extends Person(name,age){
    println("student constructor enter ...")
    override val school = "jxust"

//    重写object类的toString方法
    override def toString:String = "override def toString " + school

    println("student constructor leave ...")
}