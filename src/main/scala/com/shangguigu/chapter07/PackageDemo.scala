//package com.shangguigu.chapter07
package com.shangguigu.chapter07

/**
 * Created by liuquan on 2020/3/4.
 */
object PackageDemo {
    def main(args: Array[String]): Unit = {
        val p1 = new Person
        println(p1.age)
    }
}


class Person {
    private var name = "hi"
    var age = 34
}