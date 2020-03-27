package com.imooc.scala.course05

/**
 * Created by liuquan on 2020/1/8.
 */
object ListApp extends App {
    //    val l = List(1,2,3,4,5)
    //    val l5 = scala.collection.mutable.ListBuffer[Int]()
    //    l5+=2
    //    l5+=(3,4,5)
    //    l5++=List(6,7,8)
    //    l5-=2
    //    l5-=(3,4)
    //    l5--=List(5,6,7)
    //    l5.isEmpty
    //    println(l5)

    def sum(nums: Int*): Int = {
        if (nums.length == 0) {
            0
        } else {
            nums.head + sum(nums.tail: _*)
        }
    }
    val s= scala.collection.mutable.Set[Int]()
    s+=1
    s+=(2,3)

    println(sum())
    println(sum(1,2,3,4))
}
