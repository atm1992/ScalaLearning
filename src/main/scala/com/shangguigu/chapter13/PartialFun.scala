package com.shangguigu.chapter13

/**
 * Created by liuquan on 2020/3/21.
 */
object PartialFun {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4, "abc")

        // 偏函数的普通形式
        val partialFunc1 = new PartialFunction[Any, Int] {
            override def isDefinedAt(x: Any): Boolean = x.isInstanceOf[Int]

            override def apply(v1: Any): Int = {
                v1.asInstanceOf[Int] + 1
            }
        }
        val res1 = list.collect(partialFunc1)
        println("res1= " + res1)

        // 偏函数的第一种简写形式
        def partialFunc2: PartialFunction[Any, Int] = {
            // 偏函数中的case语句，可以不用像模式匹配那样写默认分支 case _
            // case语句会自动转换成偏函数
            case i: Int => i + 1
            case j: Double => (j * 2).toInt     // 这里必须用toInt，因为偏函数定义时的返回值类型为Int
        }

        val res2 = list.collect(partialFunc2)
        println("res2= " + res2)
        val list2 = List(1, 2, 3.6, 4.7, "abc")
        println(list2.collect(partialFunc2))

        // 偏函数的第二种简写形式。推荐使用
        val res3 = list2.collect {
            case i: Int => i + 1
            case j: Double => j * 2         // 这里可以不用写toInt，因为这里并没有明确指定偏函数的返回值类型为Int
        }
        println("res3= " + res3)
    }
}
