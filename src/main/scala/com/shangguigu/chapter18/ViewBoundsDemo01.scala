package com.shangguigu.chapter18

/**
 * Created by liuquan on 2020/3/27.
 */
object ViewBoundsDemo01 {
    def main(args: Array[String]): Unit = {
        // 这样的写法在上界中是无法运行的，而之所以能在视图界定中使用，是因为使用了隐式转换
        // 当然，视图界定也支持之前在上界中的写法
        val a1 = new CompareCommon(2,6)
        println(a1.greater)

        val a2 = new CompareCommon(5.6f, 3.2f)
        println(a2.greater)
    }
}

// 这里是视图界定，可以和上界中的案例进行对比。
// [T <% Comparable[T]] 表示输入的数据类型T是实现了Comparable接口的一个子类
class CompareCommon[T <% Comparable[T]](obj1: T, obj2: T) {
    // 因为数据类型T实现了Comparable接口，所以数据类型T的变量(对象)可以调用compareTo方法
    def greater: T = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
