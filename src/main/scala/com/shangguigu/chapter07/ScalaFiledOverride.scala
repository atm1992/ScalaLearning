package com.shangguigu.chapter07

/**
 * Created by liuquan on 2020/3/5.
 */
object ScalaFiledOverride {
    def main(args: Array[String]): Unit = {
        val obj1:AAA = new BBB
        val obj2:BBB = new BBB
        // obj1.age 看似调用的是属性，其实调用的是底层自动生成的age()方法。obj2.age同理。
        // 虽然obj1是父类(AAA)的引用，但它指向的是一个子类(BBB)对象的内存地址，
        // 由于动态绑定机制，因此，obj1调用的是子类(BBB)中的age()方法，子类(BBB)中的age()方法调用的是子类中的属性age
        // 所以obj1.age返回20。obj2.age肯定是返回20
        println("obj1.age: " + obj1.age + "\t obj2.age: " + obj2.age)
    }
}

class AAA{
    val age:Int = 10        // 底层会生成public的age()方法
}

class BBB extends AAA{
    // 底层也会生成public的age()方法，会重写上面的那个age()方法
    // 看似是属性的重写，本质是方法的重写
    override val age: Int = 20
}