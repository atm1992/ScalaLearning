package com.shangguigu.chapter12

/**
 * Created by liuquan on 2020/3/20.
 */
object MatchForDemo {
    def main(args: Array[String]): Unit = {
        val map = Map("A" -> 1, "B" -> 0, "C" -> 3)
        for ((k, 0) <- map) {       // 只匹配出map中value为0的键值对
            println(k + "-->" + 0)
        }

        for ((k, v) <- map if v == 0) {     // 与上一种方式等价。这种方式还可筛选出指定范围的v，如：1<v && v<4
            println(k + "-->" + v)
        }
    }
}
