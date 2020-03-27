package com.shangguigu.chapter08


/**
 * Created by liuquan on 2020/3/7.
 */
object ScalaInnerClass2 {
    def main(args: Array[String]): Unit = {
        val outer1: ScalaOuterClass = new ScalaOuterClass
        val outer2: ScalaOuterClass = new ScalaOuterClass

        // Scala创建内部类对象的方式与Java不一样，使用 new 外部类对象.内部类名
        // 以此可看出，Scala内部类对象与外部类对象是关联的，这与Java不同，Java的内部类对象与外部类对象不相关
        val inner1 = new outer1.ScalaInnerClass
        val inner2 = new outer2.ScalaInnerClass

        inner1.info         // 调用内部类的info方法


        // 创建静态内部类对象
        val staticInner = new ScalaOuterClass.ScalaStaticInnerClass
    }
}

class ScalaOuterClass {             // 伴生类
    // 别名定义代码必须放在第一行
    myOuter =>           // 这里的myOuter可理解为外部类ScalaOuterClass的一个实例对象，即 外部类名的别名
    var name = "小白"
    private var sal = 7000.0

    class ScalaInnerClass {         // 成员内部类
        def info: Unit = {
            // Scala嵌套类的使用方式一
            // 在内部类中可直接访问外部类中的属性(包括私有属性)：外部类名.this.属性名
            // 对于ScalaOuterClass.this.name，可将ScalaOuterClass.this 理解为是一个外部类的实例对象，
            // 通过ScalaOuterClass.this 这个外部类的实例对象 去访问 外部类的name属性
            println("name= " + ScalaOuterClass.this.name + " sal= " + ScalaOuterClass.this.sal)

            // Scala嵌套类的使用方式二：外部类名的别名.属性名
            println("name= " + myOuter.name + " sal= " + myOuter.sal)
        }

        def test(ic:ScalaOuterClass#ScalaInnerClass): Unit ={
            println("使用了类型投影" + ic)
        }
    }
}

object ScalaOuterClass {            // 伴生对象
    class ScalaStaticInnerClass {   // 静态内部类
    }
}