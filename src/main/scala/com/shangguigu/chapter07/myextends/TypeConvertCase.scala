package com.shangguigu.chapter07.myextends

/**
 * Created by liuquan on 2020/3/4.
 */
object TypeConvertCase {
    def main(args: Array[String]): Unit = {
        val stu = new Student400
        val emp = new Emp400
        test(stu)
        test(emp)
    }

    // 下面这个方法是一个参数多态的代码
    // 在OOP中，一个父类的引用(形参)可以接收所有子类的引用，多态(参数多态)
    def test(p: Person400): Unit = {
        // 使用Scala中的类型检查和转换
        if (p.isInstanceOf[Emp400]) {
            /**
             * 因为先判断了，所以p.asInstanceOf[Emp400]一定可以转换成子类Emp400的引用
             * 执行p.asInstanceOf[Emp400]会返回一个子类Emp400的引用，而对引用p本身的类型没有影响，p依旧是父类Person400的引用
             * 之所以要先强制转换成子类Emp400的引用，是因为父类Person400的引用p无法调用子类Emp400的showInfo()方法
             */
            p.asInstanceOf[Emp400].showInfo()
        } else if (p.isInstanceOf[Student400]) {
            p.asInstanceOf[Student400].cry()
        } else {
            println("转换失败")
        }
    }
}

class Person400 {
    def printName(): Unit = {
        println("Person400 printName")
    }

    def sayOk(): Unit = {
        println("Person400 sayOk")
    }
}

class Student400 extends Person400 {
    val stuId = 100

    override def printName(): Unit = {
        println("Student400 printName")
    }

    def cry(): Unit = {
        println("学生的id=" + this.stuId)
    }
}

class Emp400 extends Person400 {
    val empId = 800

    override def printName(): Unit = {
        println("Emp400 printName")
    }

    def showInfo(): Unit = {
        println("雇员的id=" + this.empId)
    }
}