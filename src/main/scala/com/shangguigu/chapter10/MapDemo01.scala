package com.shangguigu.chapter10

import scala.collection.mutable

/**
 * Created by liuquan on 2020/3/18.
 */
object MapDemo01 {
    def main(args: Array[String]): Unit = {
        val map1 = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
        println(map1) // Map(Alice -> 10, Bob -> 20, Kotlin -> 北京)。输出结果的顺序与声明顺序一致

        val map2 = mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
        println(map2) // Map(Bob -> 20, Kotlin -> 北京, Alice -> 10)。输出结果的顺序与声明顺序不一定相同

        val map3 = new mutable.HashMap[String, Int]()
        println(map3) // Map()

        val map4 = Map(("Alice", 10), ("Bob", 20), ("Kotlin", "北京"))
        println(map4)

        val map5 = mutable.Map(("Alice", 10), ("Bob", 20), ("Kotlin", "北京"))
        println(map5)

        // 方式一
        println(map1("Alice"))

        // 方式二
        if (map1.contains("Alice")) {
            println("key存在，值为 " + map1("Alice"))
        } else {
            println("key不存在")
        }

        // 方式三
        println(map1.get("Alice").get)

        // 方式四
        println(map1.getOrElse("Alice3", "默认值为0"))

        val map6 = mutable.Map(("A", 10), ("B", 20), ("C", 30))
        map6("B") = 50 // Map(A -> 10, C -> 30, B -> 50)
        println(map6)
        map6("E") = 90 // Map(A -> 10, C -> 30, E -> 90, B -> 50)
        println(map6)

        map6 += (("D", 40), "E" -> 50)
        map6 += (("D", 40))
        map6 += ("E" -> 70)
        println(map6)

        map6 -= ("A", "B")
        map6 -= ("G")
        println(map6)


        for ((k, v) <- map6) {
            println(k + " is mapped to " + v)
        }

        for (k <- map6.keys) {
            println("key= " + k)
        }

        for (v <- map6.values) {
            println("val= " + v)
        }

        for (item <- map6) {        // 这里的item类型为Tuple2
            println(item + " key= " + item._1 + " val= " + item._2)
        }
    }
}
