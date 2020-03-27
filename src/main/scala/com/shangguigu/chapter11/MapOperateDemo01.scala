package com.shangguigu.chapter11

/**
 * Created by liuquan on 2020/3/19.
 * 请将List(3,5,7) 中的所有元素都* 2 ，将其结果放到一个新的集合中返回，即返回一个新
 * 的List(6,10,14), 请编写程序实现.
 */
object MapOperateDemo01 {
    def main(args: Array[String]): Unit = {
        val list1 = List(3, 5, 7)
        var list2 = List[Int]()
        for (item <- list1) {
            list2 = list2 :+ item * 2
        }
        println("list2= " + list2)

        /**
         * 上述方法的优缺点分析：
         * 优点：处理方法比较直接，易于理解
         * 缺点：不够简洁高效；没有体现出函数式编程的特点；不利于处理复杂的数据处理业务
         */
    }
}
