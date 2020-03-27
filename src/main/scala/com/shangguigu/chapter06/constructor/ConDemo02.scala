package com.shangguigu.chapter06.constructor

/**
 * Created by liuquan on 2020/3/3.
 */
object ConDemo02{
    def main(args: Array[String]): Unit = {
        // 这里调用的是class A 的主构造器。
        // 输出的是：class B 的主构造器；class A 的主构造器
        val a1 = new A

        // 这里调用的是class A 的辅助构造器。
        // 输出的是：class B 的主构造器；class A 的主构造器；class A 的辅助构造器
        val a2 = new A("Tom")
    }
}

// B 的主构造器因为没有参数，所以省略了B后面的()
class B{
    println("class B 的主构造器")
}

// A 继承 B，执行A的主构造器之前，会先执行父类B的主构造器
class A extends B{
    println("class A 的主构造器")
    def this(name:String){
        // 先调用A的主构造器。因为A的主构造器没有参数，所以省略了this后面的()
        this
        println("class A 的辅助构造器")
    }
}