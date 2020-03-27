package com.shangguigu.chapter18.contextbounds

/**
 * Created by liuquan on 2020/3/27.
 */
object ContextBoundsDemo {
    // 定义一个隐式值。该值为泛型为Person的Ordering实例
    implicit val personComparator = new Ordering[Person] {
        override def compare(x: Person, y: Person): Int = x.age - y.age
    }

    def main(args: Array[String]): Unit = {
        val p1 = new Person("tom", 24)
        val p2 = new Person("jack", 28)
        val a1 = new CompareCommon(p1, p2)
        println(a1.greater)

        val a2 = new CompareCommon2(p1, p2)
        println(a2.greater)

        println("personComparator hashCode= " + personComparator.hashCode())
        val a3 = new CompareCommon3(p1, p2)
        println(a3.greater)
    }
}

class Person(val name: String, val age: Int) {
    override def toString: String = this.name + " " + this.age
}

// 方式一
// comparator是一个隐式形参。使用隐式值传入一个比较器给隐式形参comparator
class CompareCommon[T: Ordering](obj1: T, obj2: T)(implicit comparator: Ordering[T]) {
    def greater: T = if (comparator.compare(obj1, obj2) > 0) obj1 else obj2
}

// 方式二
// 将隐式参数放到方法体内，而不是作为一个形参
class CompareCommon2[T: Ordering](obj1: T, obj2: T) {
    def greater: T = {
        def f1(implicit comparator: Ordering[T]): Int = comparator.compare(obj1, obj2)

        if (f1 > 0) obj1 else obj2
    }
}

// 方式三
// 使用implicitly语法糖，推荐使用
class CompareCommon3[T: Ordering](obj1: T, obj2: T) {
    def greater: T = {
        // 下面这行代码会发生隐式转换，获取到隐式值personComparator
        // 使用implicitly，编译器会在底层将隐式值personComparator绑定到comparator
        val comparator = implicitly[Ordering[T]]
        // 经过hashCode对比发现，comparator其实就是personComparator
        println("comparator hashCode= " + comparator.hashCode())
        if (comparator.compare(obj1, obj2) > 0) obj1 else obj2
    }
}