package com.shangguigu.chapter08

/**
 * Created by liuquan on 2020/3/5.
 */
object ApplyDemo {
    def main(args: Array[String]): Unit = {
        // 使用普通方式来创建对象
        val p1 = new Pig("aa")

        // 使用伴生对象中的apply方法来创建对象，apply方法会自动调用，不需要显式调用
        val p2 = Pig("bb")      // 这里调用的是伴生对象中带参数的那个apply方法
        val p3 = Pig()          // 这里调用的是伴生对象中不带参数的apply方法，Pig后面的()不能省略
        println("p2.name: " + p2.name)    // bb
        println("p3.name: " + p3.name)    // 匿名猪
    }
}

class Pig(inName:String){
    var name = inName
}

object Pig{
    def apply(inName: String): Pig = new Pig(inName)

    def apply(): Pig = new Pig("匿名猪")
}