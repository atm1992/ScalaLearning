package com.shangguigu.chapter11

/**
 * Created by liuquan on 2020/3/19.
 */
object FoldDemo01 {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4)

        def minus(n1: Int, n2: Int): Int = {
            n1 - n2
        }

        /**
         * list.foldLeft(5)(minus) 可理解为：
         * 1、list = List(5, 1, 2, 3, 4)
         * 2、list.reduceLeft(minus)
         * 3、(((5 - 1) - 2) - 3) - 4 = -5
         */
        // println((5 /: list)(minus))      // 等价于下一句
        println(list.foldLeft(5)(minus))        // 使用了函数柯里化的形式。对于(5)这里，之后更多的是传入一个集合，而不是一个数
        /**
         * list.foldRight(5)(minus) 可理解为：
         * 1、list = List(1, 2, 3, 4, 5)
         * 2、list.reduceRight(minus)
         * 3、1 - (2 - (3 - (4 - 5))) = 3
         */
        // println((list :\ 5)(minus))      // 等价于下一句
        println(list.foldRight(5)(minus))       // 使用了函数柯里化的形式。对于(5)这里，之后更多的是传入一个集合，而不是一个数
    }
}
