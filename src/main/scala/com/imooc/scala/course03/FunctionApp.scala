package com.imooc.scala.course03

/**
 * Created by liuquan on 2020/1/7.
 */
object FunctionApp {
    def main(args: Array[String]): Unit = {
        //        println(add(2, 3))
        //        println(three())
        //        println(three)    // 没有入参的函数，调用时可以省略函数名后面的括号
        //        sayHello
        //        sayHello("zhanghao")
        //        sayName()
        //        sayName("ruoze")
        //        loadConf()
        //        loadConf("spark-products.conf")
        //        println(speed(100, 10))
        //        println(sum(2,3))
        //        println(sum2(1,2,3,4,5))
        //        val x=1
        //        if(x>0){
        //            true
        //        }else{
        //            false
        //        }
        //        1 to 10
        //        1.to(10)
        //        Range(1,10)
        //        1.until(10)
        //        for(i <- 1 to 10 if i%2==0){
        //            println(i)
        //        }

        val courses = Array("hadoop", "spark sql", "spark streaming", "Scala")
        //        for(course <- courses){
        //            println(course)
        //        }
        //        course 其实就是courses里面的每个元素
        //        => 就是将左边的course 作用上一个函数，然后变成另一个结果
        //        此处就是将println函数作用到course上面
        //        courses.foreach(course => println(course))

        var (num, sum) = (100, 0)
        while (num > 0) {
            sum += num
            num -= 1
        }
        println(sum)
    }

    def add(x: Int, y: Int): Int = {
        x + y // 最后一行就是返回值，不需要return
    }

    def three() = 1 + 2

    def sayHello(): Unit = {
        println("say hello……")
    }

    def sayHello(name: String): Unit = {
        println("say hello……" + name)
    }

    def sayName(name: String = "PK"): Unit = {
        println(name)
    }

    def loadConf(conf: String = "spark-defaults.conf"): Unit = {
        println(conf)
    }

    def speed(distance: Float, time: Float): Float = {
        distance / time
    }

    def sum(a: Int, b: Int): Int = {
        a + b
    }

    def sum2(numbers: Int*): Int = {
        var result = 0
        for (number <- numbers) {
            result += number
        }
        result
    }
}
