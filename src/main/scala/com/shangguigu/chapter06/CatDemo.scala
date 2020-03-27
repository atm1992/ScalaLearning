package com.shangguigu.chapter06

/**
 * Created by liuquan on 2020/3/2.
 */
// object CatDemo 对应的字节码文件有两个，CatDemo$.class、CatDemo.class
object CatDemo {
    def main(args: Array[String]): Unit = {
        val cat = new Cat
        // 这里的cat.name其实并不是直接访问name属性，而是调用的 name_$eq("小白")
        cat.name = "小白"
        cat.age = 3
        // cat.name 其实是调用的 name() 方法
        printf("小猫的信息为：%s %d", cat.name, cat.age)
    }
}

// class Cat 对应的字节码文件只有一个Cat.class
// 默认为 public class
class Cat {
    // 必须要给初始值
    var name: String = _
    var age: Int = _
}