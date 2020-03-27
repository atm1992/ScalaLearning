package com.shangguigu.chapter18

/**
 * Created by liuquan on 2020/3/27.
 */
object LowerBoundsDemo01 {
    def main(args: Array[String]): Unit = {
        // biophony(Seq(new Earth, new Earth)) 返回的是 Seq[Earth]
        biophony(Seq(new Earth, new Earth)).map(_.sound())       // 对
        // biophony(Seq(new Animal, new Animal)) 返回的是 Seq[Animal]
        biophony(Seq(new Animal, new Animal)).map(_.sound())     // 对

        /**
         * biophony(Seq(new Bird, new Bird)) 返回的是 Seq[Animal]
         * 将子类Bird的实例传给了父类Animal的引用，但是该实例对象调用的依然是子类Bird的sound方法
         * 若子类Bird中没有sound方法，则调用父类Animal的sound方法
         */
        biophony(Seq(new Bird, new Bird)).map(_.sound())         // 对。这里会和预想中有些不一样

        // biophony(Seq(new Moon, new Moon)) 返回的是 Seq[Object]
        // 与Animal类无关的类，也能传入，只是会将这些类按照Object类来处理
        // 但因为Object类中没有sound方法，所以这里后面不能使用 .map(_.sound())，虽然在Moon类中定义了sound方法
        biophony(Seq(new Moon, new Moon))
    }

    // 下界。传入的数据类型T需要是Animal类的父类或者就是Animal类
    // 子类中存在的方法，在父类中未必存在；而父类中的方法，子类中肯定存在
    // 所以不能在这里像上界那样使用 things map (_.sound)，而是直接返回一个things序列
    // 因为虽然Animal类中的确有sound方法，但无法保证Animal类的父类中也都存在sound方法
    def biophony[T >: Animal](things: Seq[T]) = things
}

class Earth {
    def sound() = println("hello earth")
}

class Animal extends Earth {
    override def sound() = println("animal sound")
}

class Bird extends Animal {
    override def sound() = println("bird sounds")
}

class Moon {
    def sound() = println("hello moon")
}
