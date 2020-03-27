package com.shangguigu.chapter08.mixin

/**
 * Created by liuquan on 2020/3/6.
 */
object MixinPro {
    def main(args: Array[String]): Unit = {
        val mySQL = new MySQL6 with DB6
        println(mySQL.name)
    }
}

trait DB6 {
    var name: String = "trait DB6"

    def insert: Unit = {}
}

class MySQL6 {}