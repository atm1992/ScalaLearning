package com.shangguigu.chapter10

import scala.collection.mutable

/**
 * Created by liuquan on 2020/3/18.
 */
object QueueDemo01 {
    def main(args: Array[String]): Unit = {
        val q1 = new mutable.Queue[Int]     // Queue()
        q1 += 20                // Queue(20)
        q1 ++= List(2, 4, 6)    // Queue(20, 2, 4, 6)
        // 表示将List(8,9)作为一个元素加入到队列中，前提是队列的数据类型为Any
        // q1 += List(8, 9)        // Queue(20, 2, 4, 6, List(8, 9))

        // q1 会发生改变，删除队列头部的元素
        val queueEle = q1.dequeue()     // queueEle=20	q1=Queue(2, 4, 6)

        // q1 会发生改变，在队列尾部添加元素
        q1.enqueue(10,7,10,3)       // q1=Queue(2, 4, 6, 10, 7, 10, 3)

        // 获取队列的第一个元素，返回的是一个元素值。q1不变
        println(q1.head)        // 2
        // 获取队列的最后一个元素，返回的是一个元素值。q1不变
        println(q1.last)        // 3
        // 获取第一个元素以外的其余所有元素，返回的是一个队列。q1不变
        println(q1.tail)        // Queue(4, 6, 10, 7, 10, 3)
        println(q1.tail.tail.tail.tail)     // Queue(7, 10, 3)
    }
}
