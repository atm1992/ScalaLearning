package com.shangguigu {        // 包com.shangguigu

    import com.shangguigu.chapter07_2.Car      // 在父包中使用子包chapter07_2中的Car类
    class Person {
        var name: String = "Person in shangguigu"

        def sayHi: Unit ={
            val c1 = new Car
        }
    }

    package chapter07 {         // 包com.shangguigu.chapter07

        import scala.io.StdIn   // 在包下面import package
        object PackageDemo2 {   // 在包com.shangguigu.chapter07下创建object PackageDemo2
            def main(args: Array[String]): Unit = {
                println("输入一个Int: ")
                println(StdIn.readInt)

                val p1 = new Person3
                println(p1.name)    // Person in chapter07

                val p2 = new com.shangguigu.Person
                println(p2.name)    // Person in shangguigu

                val p3 = new com.shangguigu.chapter07_2.Person
                println(p3.name)    // Person in chapter07_2
            }
        }

        class Person3 {          // 在包com.shangguigu.chapter07下创建class Person
            var name: String = "Person in chapter07"
        }
    }

    package chapter07_2 {       // 包com.shangguigu.chapter07_2
        class Person {          // 在包com.shangguigu.chapter07_2下创建class Person
            var name: String = "Person in chapter07_2"
        }

        class Car{
            var name: String = "Car in chapter07_2"
        }
    }
}


