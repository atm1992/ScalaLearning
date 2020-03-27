package com.shangguigu.chapter07.myextends

/**
 * Created by liuquan on 2020/3/4.
 */
object TypeConvert {
    def main(args: Array[String]): Unit = {
        // 使用classOf 获取对象的类名
        println(classOf[String])    // class java.lang.String
        val s = "king"
        println(s.getClass.getName) //使用反射机制。输出 java.lang.String

        var p1 = new Person200      // 父类的引用p1
        var emp = new Emp200        // 子类的引用emp
        // 将子类的引用赋给父类(会自动向上转型)
        p1 = emp
        // 将父类的引用重新转成子类引用(多态)，即 向下转型，需要强制转换
        var emp2 = p1.asInstanceOf[Emp200]
        emp2.sayHello()             // 此时可以调用子类的方法sayHello()
    }
}

//Person 类
class Person200 {
    var name: String = "tom"

    def printName() { //输出名字
        println("Person printName() " + name)
    }

    def sayHi(): Unit = {
        println("sayHi...")
    }
}

//这里我们继承Person
class Emp200 extends Person200 {
    //这里需要显式的使用override
    override def printName() {
        println("Emp printName() " + name)
        //在子类中需要去调用父类的方法,使用super
        super.printName()
        sayHi()
    }

    def sayHello(): Unit = {
    }
}