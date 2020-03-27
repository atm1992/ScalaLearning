package com.shangguigu.chapter06.homework

/**
 * Created by liuquan on 2020/3/3.
 */
object DogCase {
    def main(args: Array[String]): Unit = {
        val dog = new Dog
        dog.name = "tom"
        dog.age = 2
        dog.weight = 6.4
        println(dog.say)
    }
}

class Dog {
    var name: String = _
    var age: Int = _
    var weight: Double = _

    def say: String = {
        "小狗的信息为：name=" + this.name + "\t age=" + this.age + "\t weight=" + this.weight
    }
}