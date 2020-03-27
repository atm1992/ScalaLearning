package com.shangguigu.chapter07 {      // 包com.shangguigu.chapter07
    package object objectDemo {        // package objectDemo 对应的包对象objectDemo
        var name = "package object scala"

        def sayHi: Unit = {
            println("package object scala sayHi~")
        }
    }

    package objectDemo {            // 包com.shangguigu.chapter07.objectDemo
        class Person1 {
            var name = "package scala"
        }

        object PackageObjectDemo {
            def main(args: Array[String]): Unit = {
                // 这里使用的是包对象objectDemo中的变量和方法，无需import什么，直接使用
                sayHi
                println("name: " + name)

                val p1 = new Person1
                println("p1.name: " + p1.name)
            }
        }
    }
}

