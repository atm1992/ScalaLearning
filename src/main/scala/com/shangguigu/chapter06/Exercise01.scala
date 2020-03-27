package com.shangguigu.chapter06

/**
 * Created by liuquan on 2020/3/3.
 */
object Exercise01 {
    def main(args: Array[String]): Unit = {
        val exec = new MethodExec
        exec.width = 2.4
        exec.height = 3.2
        println(exec.getArea)
    }
}


class MethodExec{
    var width = 0.0
    var height = 0.0
    def printRect ={
        for (i<-1 to 10){
            for(j<-1 to 8){
                print("*")
            }
            println()
        }
    }
    def getArea={
        (this.width*this.height).formatted("%.2f").toDouble
    }
}