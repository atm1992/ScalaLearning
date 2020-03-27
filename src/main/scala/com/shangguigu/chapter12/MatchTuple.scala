package com.shangguigu.chapter12

/**
 * Created by liuquan on 2020/3/20.
 */
object MatchTuple {
    def main(args: Array[String]): Unit = {
        for (pair <- Array((0, 1), (1, 0), (10, 30), (1, 1), (1, 0, 2))) {
            val result = pair match {
                case (0, _) => "元组的第一个元素为0"
                case (x, 0) => "元组的第二个元素为0，第一个元素为 " + x
                case (x, y) => (y, x)
                case _ => "other"
            }
            println(result)
        }
    }
}
