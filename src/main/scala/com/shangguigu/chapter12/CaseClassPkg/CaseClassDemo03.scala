package com.shangguigu.chapter12.CaseClassPkg

/**
 * Created by liuquan on 2020/3/21.
 */
object CaseClassDemo03 {
    def main(args: Array[String]): Unit = {
        val amt = Currency3(3000.0, "RMB")
        amt.copy()      // 类似于Java中的克隆，创建一个与现有对象完全相同的新对象，属性值也相同
        println(amt.value + " " + amt.unit)     // 前面说过，样例类主构造器中的局部变量的修饰符默认为val，即 只读
        println(amt)    // 这里调用自动生成的toString方法

        val amt2 = amt.copy(value = 8000.0)     // 在copy时，可以通过带名参数来修改指定属性的值
        println(amt2)
    }
}

abstract class Amount3 {}
case class Dollar3(value:Double) extends Amount3 {}       // 样例类
case class Currency3(value:Double,unit:String) extends Amount3 {}     // 样例类
case object NoAmount3 extends Amount3 {}      // 样例类