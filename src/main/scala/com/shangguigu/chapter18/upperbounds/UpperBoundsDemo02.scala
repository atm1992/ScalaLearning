package com.shangguigu.chapter18.upperbounds

/**
 * Created by liuquan on 2020/3/27.
 */
object UpperBoundsDemo02 {
    def main(args: Array[String]): Unit = {
        biophony(Seq(new Bird, new Bird))       // 对
        biophony(Seq(new Animal, new Animal))   // 对
        biophony(Seq(new Animal, new Bird))     // 对
//        biophony(Seq(new Earth, new Earth))     // 错。因为Earth类不是Animal类的子类
    }

    // 上界。传入的数据类型T需要是Animal类的子类或者就是Animal类
    // things map (_.sound) 等价于 things.map(_.sound)
    def biophony[T <: Animal](things: Seq[T]) = things map (_.sound)
}

class Earth {
    def sound() = println("hello !")
}

class Animal extends Earth {
    override def sound() = println("animal sound")
}

class Bird extends Animal {
    override def sound() = println("bird sounds")
}
