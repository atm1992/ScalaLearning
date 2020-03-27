package com.imooc.scala.course06

/**
 * Created by liuquan on 2020/1/8.
 */
object ExceptionApp extends App{
//    IO
    val file = "test.txt"

    try{
//        open file
//        use file

        val i = 10/0
        println(i)
    }catch {
        case e:ArithmeticException => println("除数不能为0")
        case e:Exception => println(e.getMessage)
    }finally {
//        释放资源，一定会执行。例如：close file

    }
}
