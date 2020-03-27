package com.shangguigu.chapter11


/**
 * Created by liuquan on 2020/3/19.
 * 请将List(3,5,7) 中的所有元素都* 2 ，将其结果放到一个新的集合中返回，即返回一个新的List(6,10,14)
 */
object MapOperateDemo02 {
    def multiple(n: Int): Int = {
        println("multiple函数被调用")
        2 * n
    }

    def main(args: Array[String]): Unit = {
        val list1 = List(3, 5, 7)

        /**
         * list1.map(multiple)
         * 1、将list1这个集合中的元素依次遍历
         * 2、将各个元素传递给multiple函数，然后返回一个新的Int
         * 3、将得到的新Int放入到一个新的集合中，然后返回
         * 4、multiple函数会被调用3次
         */
        val list2 = list1.map(multiple)
        println(list2)

        // 模拟map映射函数的实现机制
        val myList = new MyList(list1)
        val list3 = myList.map(multiple)
        println(list3)
    }
}

// 模拟map映射函数的实现机制
class MyList(li: List[Int]) {
    import scala.collection.mutable.ListBuffer
    val tmpLi = new ListBuffer[Int]

    def map(f: Int => Int): List[Int] = {
        for (item <- li) {
            tmpLi += f(item)
        }
        tmpLi.toList
    }
}