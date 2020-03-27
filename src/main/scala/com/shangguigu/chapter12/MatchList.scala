package com.shangguigu.chapter12

/**
 * Created by liuquan on 2020/3/20.
 */
object MatchList {
    def main(args: Array[String]): Unit = {
        for (list <- List(List(0), List(1, 0), List(88), List(0, 0, 0), List(1, 0, 0))) {
            val result = list match {
                case 0 :: Nil => "列表中只有一个元素且该元素为0"
                case x :: Nil => x
                case x :: y :: Nil => "列表中有两个元素，元素值分别为：" + x + "、" + y
                case 0 :: tail => "列表的第一个元素为0"      // 这里的tail可以写成别的名字，如：other，也可写 _
                case _ => "something else"
            }
            println("result= " + result)
        }
    }
}
