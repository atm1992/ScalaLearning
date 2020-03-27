package com.imooc.scala.course07

/**
 * Created by liuquan on 2020/1/9.
 * 匿名函数：函数可以命名，也可以不命名
 * (参数名:参数类型……) => 函数体
 */
object FunctionApp extends App{
//    val m1 = (x:Int)=>x+1
//    println(m1(10))
//
//    def add = (x:Int,y:Int)=>{x+y}
//    println(add(2,5))
//
////    函数柯里化就是将原来接收两个参数的一个函数，转换成2个
//    def sum(a:Int,b:Int)=a+b
//    println(sum(2,3))
////    函数柯里化之后
//    def sum2(a:Int)(b:Int)=a+b
//    println(sum2(2)(3))

    val l = List(1,2,3,4,5,6,7,8)
//    l.map((x:Int)=>x+1).foreach(println)
//    l.map(x=>x+1).foreach(println)
    l.map(_+1).foreach(println)
    l.map(_+1).filter(_>8).foreach(println)         // 过滤出大于8的元素
    l.take(3)           // 取出前3个元素
    l.reduce(_-_)
    l.reduceLeft(_-_)
    l.reduceRight(_-_)
    l.fold(0)(_-_)
    l.foldLeft(0)(_-_)
    l.foldRight(0)(_-_)
    l.min
    l.max
    l.sum

    val f = List(List(1,2),List(3,4),List(5,6))
    f.flatten           // 将二维数组转换为一位数组

//    flatMap。可理解为先flatten拍扁成一维数组，然后通过 _.map(_*2) 对一维数组中的每个元素进行操作
    f.map(_.map(_*2))
    f.flatMap(_.map(_*2))

    val txt = scala.io.Source.fromFile("/Users/quan/helloworld.txt").mkString
//    println(txt)

    val t = List(txt)
//    链式编程
    t.flatMap(_.split(",")).map((_,1)).foreach(println)

}
