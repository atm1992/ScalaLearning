package com.shangguigu.chapter18.covariantcontravariant

/**
 * Created by liuquan on 2020/3/27.
 */
object Demo {
    def main(args: Array[String]): Unit = {
        val t1: Temp[Sub] = new Temp[Sub]("hello")   // ok
        // val t2:Temp[Super] = new Temp[Sub]("hello")     // 报错，因为Temp[A]不支持协变
        // val t3:Temp[Sub] = new Temp[Super]("hello")     // 报错，因为Temp[A]不支持逆变

        val t4: Temp2[Sub] = new Temp2[Sub]("hello")    // ok
        val t5: Temp2[Super] = new Temp2[Sub]("hello")  // ok，因为Temp2[+A]支持协变
        // val t6:Temp2[Sub] = new Temp2[Super]("hello")      // 报错，因为Temp2[+A]不支持逆变

        val t7: Temp3[Sub] = new Temp3[Sub]("hello")    // ok
        // val t8: Temp3[Super] = new Temp3[Sub]("hello")     // 报错，因为Temp3[-A]不支持协变
        val t9: Temp3[Sub] = new Temp3[Super]("hello")  // ok，因为Temp3[-A]支持逆变
    }
}

// 不可变
class Temp[A](title: String) {
    override def toString: String = title
}

// 协变
class Temp2[+A](title: String) {
    override def toString: String = title
}

// 逆变
class Temp3[-A](title: String) {
    override def toString: String = title
}

class Super
class Sub extends Super