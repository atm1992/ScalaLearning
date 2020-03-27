package com.shangguigu.chapter16

/**
 * Created by liuquan on 2020/3/25.
 */
object Exercise8 {
    def main(args: Array[String]): Unit = {
        println(adjustToPair(_*_)((6,7)))
        val pairs = (1 to 10).zip(11 to 20)
        println(pairs)
        println(pairs.map(adjustToPair(_+_)))
    }

    def adjustToPair(fun:(Int,Int)=>Int)={
        x:(Int,Int) => fun(x._1,x._2)
    }
}
