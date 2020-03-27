package com.shangguigu.chapter06.homework

/**
 * Created by liuquan on 2020/3/3.
 */
object Job1 {
    def main(args: Array[String]): Unit = {
        println(sigNum(9))
        println(sigNum(0))
        println(sigNum(-9))
        val t = {}
        println(t.isInstanceOf[Unit] + " " + t)
        for (i <- 1 to 5 reverse) {
            println(i)
        }

        (1 to 5).reverse.foreach(println)

        val list = List(1, 2, 3)
        println(list.reverse) // List(3, 2, 1)

        val s = "Hello"
        var res: Long = 1L
        println(getStringMulti(s))
        s.foreach(res *= _.toLong)
        println("res=" + res)

        println("product(s)="+product(s))

        printf("getPower(%f,%d) = %.2f",22.3,4,getPower(22.3,4))
    }

    def sigNum(num: Int): Int = {
        if (num > 0) {
            1
        } else if (num < 0) {
            -1
        } else {
            0
        }
    }

    def getPower(x:Double,n:Int):Double={
        if (n==0) 1
        else if (n>0) x*getPower(x,n-1)
        else 1/getPower(x,-n)
    }

    def myShow(num: Int): Unit = {
        println(num)
    }

    def getStringMulti(s: String): Long = {
        var res: Long = 1
        for (i <- s) {
            res *= i.toLong
        }
        res
    }
    def product(s:String): Long ={
        if (s.length==1) return s.charAt(0).toLong
        else s.take(1).charAt(0).toLong*product(s.drop(1))
    }
}