package com.shangguigu.chapter05

/**
 * Created by liuquan on 2020/3/2.
 */
object Recursive {
    def main(args: Array[String]): Unit = {
        test1(4)        // 2,3,4
        test2(4)        // 2
    }

    def test1(n: Int): Any = {
        if (n > 2) {
            test1(n - 1)
        }
        println("n=" + n)
    }

    def test2(n: Int): Any = {
        if(n>2){
            test2(n-1)
        }else{
            println("n="+n)
        }
    }
}
