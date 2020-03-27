package com.shangguigu.chapter08.homework

/**
 * Created by liuquan on 2020/3/6.
 */
object Exercise01 {
    def main(args: Array[String]): Unit = {
        val p1 = Point(3,4)
        p1.showPoint()
        val p2 = Point(5,7)
        p2.showPoint()
    }
}

class Point(x:Int,y:Int){
    var xx = x
    var yy = y
    def showPoint(): Unit ={
        println("x is " + xx + " y is " + yy)
    }
}

object Point{
    def apply(x: Int, y: Int): Point = new Point(x, y)

}