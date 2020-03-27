package com.shangguigu.chapter04.forloop

import scala.collection.mutable.ListBuffer

/**
 * Created by liuquan on 2020/3/2.
 */
object QuickSort {
    def main(args: Array[String]): Unit = {
        val li = ListBuffer(1, -5, 6, 100, 4, 8, 4)
        println("快排前： " + li)
        println("快排后： " + quickSort(li))
    }

    def quickSort(li: ListBuffer[Int]): ListBuffer[Int] = {
        if (li.length < 2) {
            return li
        }
        val mid: Int = li.head
        var left = new ListBuffer[Int]
        var right = new ListBuffer[Int]
        for (i <- 1 until li.length) {
            if (li(i) <= mid) left.append(li(i))
            if (li(i) > mid) right.append(li(i))
        }
        left = quickSort(left)
        right = quickSort(right)
        left.append(mid)
        left ++ right
    }
}
