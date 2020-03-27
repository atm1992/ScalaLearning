package com.shangguigu.chapter08.homework

/**
 * Created by liuquan on 2020/3/6.
 */
object Exercise05 {
    def main(args: Array[String]): Unit = {

    }
}

abstract class Shape{
    def centerPoint()
}

class Rectangle(startX:Int,startY:Int,endX:Int,endY:Int) extends Shape{
    override def centerPoint(): Unit = {}
}

class Circle(x:Int,y:Int,radius:Double) extends Shape{
    override def centerPoint(): Unit = {}
}