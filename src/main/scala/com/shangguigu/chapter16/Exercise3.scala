package com.shangguigu.chapter16

/**
 * Created by liuquan on 2020/3/24.
 */
object Exercise3 {
    def main(args: Array[String]): Unit = {
        val x = List(Some(3), None, Some(5), None)
        println(x, sum(x))
    }

    // 计算List[Option[Int]]中所有非None值的和
    def sum(lst: List[Option[Int]]) = {
        lst.map(_.getOrElse(0)).sum
    }
}
