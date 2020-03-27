package com.shangguigu.chapter16

/**
 * Created by liuquan on 2020/3/25.
 */
object WordCount {
    def main(args: Array[String]): Unit = {
        val lines = List("spark hello hadoop flume", "world scala python java spark scala", "python hi go")

        val res1 = lines.flatMap(_.split(" "))
        println("res1= " + res1)

        val res2 = res1.map((_, 1))
        println("res2= " + res2)

        // 使用groupBy按照对偶元组中的第一个元素(作为key)进行分组
        val res3 = res2.groupBy(_._1)
        println("res3= " + res3)

        // val res4 = res3.map((x:(String,List[(String,Int)])) => (x._1,x._2.size))
        val res4 = res3.map(x => (x._1, x._2.size))
        println("res4= " + res4)

        // val res5 = res4.toList.sortBy((x:(String,Int))=> x._2).reverse
        val res5 = res4.toList.sortBy(_._2).reverse
        println("res5= " + res5)

        // 将上面的各个步骤连起来
        val res = lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map(x => (x._1, x._2.size)).toList.sortBy(_._2).reverse
        println("res= " + res)


        val m1 = Map("java" -> List(("java", 2)), "spark" -> List(("spark", 3), ("spark", 5)), "scala" -> List(("scala", 7), ("scala", 1)))
        val m1_res1 = m1.map(x => (x._1, x._2.map(_._2).sum))
        println("m1_res1= " + m1_res1)

        val m1_res2 = m1_res1.toList.sortBy(_._2).reverse
        println("m1_res2= " + m1_res2)
    }
}
