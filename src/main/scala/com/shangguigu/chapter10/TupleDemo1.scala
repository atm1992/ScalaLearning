package com.shangguigu.chapter10

/**
 * Created by liuquan on 2020/3/18.
 */
object TupleDemo1 {
    def main(args: Array[String]): Unit = {
        val tuple1 = (1, 2, 3, "hello", 4)
        println(tuple1._1 == tuple1.productElement(0))

        for (item <- tuple1.productIterator) {
            println(item)
        }
    }
}
