package com.shangguigu.chapter18.upperbounds

/**
 * Created by liuquan on 2020/3/27.
 */
object UpperBoundsDemo01 {
    def main(args: Array[String]): Unit = {
        val compareInt = new CompareInt(23, 45)         // 传统方法
        println(compareInt.greater)

        val a1 = new CompareCommon(Integer.valueOf(34), Integer.valueOf(67))    // 使用上界的方式
        println(a1.greater)

        // 这里的数据类型必须是实现了Comparable接口的子类
        // java.lang.Integer类实现了Comparable接口(查看源码)
        val a1_2 = new CompareCommon[java.lang.Integer](34, 67)
        println(a1_2.greater)

        val a2 = new CompareCommon(java.lang.Float.valueOf(5.6f), java.lang.Float.valueOf(3.2f))
        println(a2.greater)

        // java.lang.Float类实现了Comparable接口(查看源码)
        // 这里其实用到了隐式转换，将Scala中的Float值(5.6f,3.2f)隐式转换成了Java中的Float值(java.lang.Float)
        // 为什么要先转换成Java中的Float(java.lang.Float)，因为Java中的Float实现了Comparable接口
        val a2_2 = new CompareCommon[java.lang.Float](5.6f, 3.2f)
        println(a2_2.greater)
    }
}

// 传统方法。有多少种数据类型，就要写多少个class
class CompareInt(n1: Int, n2: Int) {
    def greater: Int = if (n1 > n2) n1 else n2
}

// 使用上界的方式。
// [T <: Comparable[T]] 的理解：
// 1、T 为泛型，<: 是上界关键字
// 2、T <: Comparable[T] 表示输入的数据类型T是实现了Comparable接口的一个子类
class CompareCommon[T <: Comparable[T]](obj1: T, obj2: T) {
    // 因为数据类型T实现了Comparable接口，所以数据类型T的变量(对象)可以调用compareTo方法
    def greater: T = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
