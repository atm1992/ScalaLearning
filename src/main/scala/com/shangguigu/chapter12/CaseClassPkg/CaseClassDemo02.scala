package com.shangguigu.chapter12.CaseClassPkg

/**
 * Created by liuquan on 2020/3/21.
 */
object CaseClassDemo02 {
    def main(args: Array[String]): Unit = {
        // 这里其实就是对象匹配，因为这些类是样例类，所以会自动生成unapply 方法(对象提取器)，
        // 将构建对象时传入的参数提取出来，并赋给case后面的变量
        for (amt <- Array(Dollar2(1000.0), Currency2(1000.0, "RMB"), NoAmount2)) {
            val result = amt match {
                case Dollar2(v) => v        // 1000.0
                case Currency2(v,u) => v + " " + u      // 1000.0 RMB
                case NoAmount2 => " "       // " "
            }
            println(amt + " " + result)
        }
    }
}

abstract class Amount2 {}
case class Dollar2(value:Double) extends Amount2 {}       // 样例类
case class Currency2(value:Double,unit:String) extends Amount2 {}     // 样例类
case object NoAmount2 extends Amount2 {}      // 样例类