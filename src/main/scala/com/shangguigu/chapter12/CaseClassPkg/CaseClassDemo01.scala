package com.shangguigu.chapter12.CaseClassPkg

/**
 * Created by liuquan on 2020/3/21.
 */
object CaseClassDemo01 {
    def main(args: Array[String]): Unit = {
        println("ok")
    }
}

abstract class Amount {}
case class Dollar(value:Double) extends Amount {}       // 样例类
case class Currency(value:Double,unit:String) extends Amount {}     // 样例类
case object NoAmount extends Amount {}      // 样例类