package com.shangguigu.chapter18

/**
 * Created by liuquan on 2020/3/27.
 */
object ViewBoundsDemo03 {
    def main(args: Array[String]): Unit = {
        // 定义一个隐式函数，在创建Person3实例时会被自动调用，返回的Person3实例可以调用特质Ordered的compare方法
        // 通常会把所有的隐式函数都写到一个文件中，然后在需要的地方引入即可
        implicit def person3toOrderedPerson3(p3: Person3) = new Ordered[Person3] {
            override def compare(that: Person3): Int = {
                p3.age - that.age
            }
        }

        val p1 = new Person3("tom", 26)
        val p2 = new Person3("jack", 24)
        val a1 = new CompareCommon3(p1, p2)
        println(a1.greater2)
    }
}

class Person3(val name: String, val age: Int) {
    // 重写toString方法，只是为了显示方便
    override def toString: String = this.name + "\t" + this.age
}

class CompareCommon3[T <% Ordered[T]](obj1: T, obj2: T) {
    def greater1: T = if (obj1 > obj2) obj1 else obj2
    // greater1 和 greater2 其实是等价的
    def greater2: T = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}