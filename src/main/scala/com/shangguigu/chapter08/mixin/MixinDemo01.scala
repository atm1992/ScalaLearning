package com.shangguigu.chapter08.mixin

/**
 * Created by liuquan on 2020/3/6.
 */
object MixinDemo01 {
    def main(args: Array[String]): Unit = {
        // 对于普通的类，可直接使用 with 来动态混入特质Operate中的方法
        val oracleDB = new OracleDB with Operate
        oracleDB.insert(3)

        // 对于没有抽象方法的抽象类，也可直接使用 with 来动态混入特质Operate中的方法
        val mySQL = new MySQL("45") with Operate
        mySQL.insert(6)

        // 对于含有抽象方法的抽象类，可以先使用with连接特质Operate，然后在后面的{}中实现抽象方法
        val mysql_a = new MySQL2 with Operate {
            override def say(): Unit = {
                println("abstract method in MySQL2 is saying Hi~")
            }
        }
        mysql_a.insert(8)
        mysql_a.say()
    }
}


trait Operate {
    def insert(id: Int): Unit = {
        println("插入数据：" + id)
    }
}

// 普通类
class OracleDB {}

// 没有抽象方法的抽象类
abstract class MySQL(a:String) {
    val aa = a
}

// 含有抽象方法的抽象类
abstract class MySQL2 {
    def say()
}