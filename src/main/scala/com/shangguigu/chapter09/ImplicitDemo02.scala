package com.shangguigu.chapter09

/**
 * Created by liuquan on 2020/3/13.
 */
object ImplicitDemo02 {
    // 使用隐式函数来丰富MySQL类的功能，动态增加DB类中的方法，从而可以使用DB类中的delete方法
    // 隐式函数主要看参数类型与返回值类型。这里的参数类型为MySQL，用于匹配MySQL对象，然后自动将其转换为DB对象
    implicit def addDel(mysql:MySQL):DB={
        new DB
    }

    def main(args: Array[String]): Unit = {
        val mySQL = new MySQL
        mySQL.insert()      // MySQL insert
        mySQL.delete()      // DB delete 。addDel(mySQL).delete()
    }
}

class MySQL{
    def insert(): Unit ={
        println("MySQL insert")
    }
}

class DB{
    def delete(): Unit ={
        println("DB delete")
    }

    def insert(): Unit ={
        println("DB insert")
    }
}