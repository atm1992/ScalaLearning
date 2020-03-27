package com.shangguigu.chapter07.visit


/**
 * Created by liuquan on 2020/3/4.
 */
object TestVisit {
    def main(args: Array[String]): Unit = {
        val c = new Clerk
        // 这里无法访问 c.sal(private) 以及 c.age(protected)
        c.showInfo()
        // 这里使用的是伴生对象Clerk
        Clerk.test(c)

        val s1 = new Student
        // private[visit] 给name属性添加了包访问权限
        println(s1.name)
    }
}

class Clerk {
    // 其实下面这两个属性在字节码文件中都是private
    // 区别在于下面的name属性会提供public的读写方法，即 name属性可读可写
    // 而sal属性只有public的sal()方法，即 sal属性只读不可写
    var name = "jack"
    private var sal = 9999.9
    protected var age = 18

    def showInfo(): Unit = {
        println(" name " + name + " sal= " + sal)
    }
}

// 当一个文件中，同时出现了class Clerk 和 object Clerk
// class Clerk 称为伴生类；object Clerk 称为伴生对象
object Clerk {
    def test(c: Clerk): Unit = {
        // 在伴生对象中可以访问伴生类中的所有属性和方法，包括private属性和方法，例如这里的 c.sal
        println("test() name=" + c.name + " sal= " + c.sal)
    }

    def test2: Unit ={
        import scala.collection.mutable.HashMap
        // 将java.util中的HashMap 重命名为 JavaHashMap
        import java.util.{HashMap => JavaHashMap}

        // 使用的是scala.collection.mutable中的HashMap
        var map1 = new HashMap()
        // 使用的是java.util中的HashMap
        var map2 = new JavaHashMap()
    }
}

class Student{
    // 因为属性name前面加了 private，所以在类的外部将无法访问该属性
    // 但在private的后面加了 [visit] 之后，(visit是当前这个包的名字)，相当于添加了包访问权限
    // private[visit]说明：1、该属性仍然是private；2、在visit包(以及子包)内可以访问该属性，相当于扩大了该属性的访问范围
    // 若把 private[visit] 改成 private[chapter07]，则表示在chapter07包以及子包内都可以访问该属性
    // 这里的private也能换成protected，道理是一样的
    private[visit] var name = "Tom"
}
