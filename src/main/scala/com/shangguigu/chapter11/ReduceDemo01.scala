package com.shangguigu.chapter11

/**
 * Created by liuquan on 2020/3/19.
 */
object ReduceDemo01 {
    def main(args: Array[String]): Unit = {
        val list = List(1,2,3,4,5)
        /**
         * reduceLeft 的执行流程：
         * 1、(1+2)
         * 2、(1+2) + 3
         * 3、((1+2)+3) + 4
         * 4、(((1+2)+3)+4) + 5 = 15
         * 因此，sum函数被调用4次
         */
        val res = list.reduceLeft(sum)
        println(res)

        println(list.reduce(min))
    }

    def min(n1:Int,n2:Int):Int={
        if (n1<=n2) n1 else n2
    }

    def sum(n1:Int,n2:Int):Int={
        println("sum函数被调用")
        n1+n2
    }
}
