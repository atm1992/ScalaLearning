package com.shangguigu.chapter18

/**
 * Created by liuquan on 2020/3/27.
 */
object ViewBoundsDemo02 {
    def main(args: Array[String]): Unit = {
        val p1 = new Person("tom", 10)
        val p2 = new Person("jack", 14)
        val a1 = new CompareCommon2(p1, p2)
        println(a1.greater1)
        println(a1.greater2)

        val smith = new Cat("smith")
        val tom = new Cat("tom")
        val a2 = new CompareCommon2(smith, tom)
        println(a2.greater1.name)
        println(a2.greater2.name)
    }
}

class Person(val name: String, val age: Int) extends Ordered[Person] {
    override def compare(that: Person): Int = this.age - that.age

    // 重写toString方法，只是为了显示方便
    override def toString: String = this.name + "\t" + this.age
}

class Cat(val name: String) extends Ordered[Cat] {
    // 比较name的长度大小
    override def compare(that: Cat): Int = this.name.length - that.name.length
}

// 输入的数据类型T是Ordered的子类，Ordered是一个继承了Comparable接口的特质
// greater2方法中调用的compareTo方法是数据类型T的方法，因为它是实现了Comparable接口的一个子类
// compareTo方法底层调用的是compare方法，这里的Person类继承了Ordered特质以后，重写了compare方法
// 只要是继承(实现)了Ordered特质的类型，就都可以传入
class CompareCommon2[T <% Ordered[T]](obj1: T, obj2: T) {
    // > 在底层调用的就是Ordered特质中的compare方法
    def greater1: T = if (obj1 > obj2) obj1 else obj2

    // compareTo 调用的是Ordered特质中的compareTo方法，该方法底层调用的是compare方法
    def greater2: T = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}