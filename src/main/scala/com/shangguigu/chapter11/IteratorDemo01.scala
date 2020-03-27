package com.shangguigu.chapter11

/**
 * Created by liuquan on 2020/3/20.
 */
object IteratorDemo01 {
    def main(args: Array[String]): Unit = {
        val iterator1 = List(1, 2, 3, 4, 5).iterator // 得到一个迭代器
        while (iterator1.hasNext) {
            println(iterator1.next())
        }
        // 需要注意：iterator1遍历完一次之后，iterator1.hasNext变为了false，若之后再用while、for循环去遍历iterator1，则得到的结果为空，因此此时的next指针指向了空


        val iterator2 = List(6, 7, 8, 9, 10).iterator // 得到一个迭代器
        for (enum <- iterator2) {
            println(enum)
        }
    }
}
