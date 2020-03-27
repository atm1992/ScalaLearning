package com.shangguigu.chapter11

/**
 * Created by liuquan on 2020/3/20.
 */
object StreamDemo01 {
    def main(args: Array[String]): Unit = {
        /**
         * 这里的numsForm函数是一个自定义的元素生成规则，函数名numsForm是随便自定义的
         * 通过 调用numsForm函数 来创建一个Stream集合，函数调用时传入的参数n就是该Stream集合的第一个元素
         * Stream[BigInt] —— 该Stream集合中元素的数据类型为BigInt
         * numsForm(n+1) —— 后续元素生成的规则为 n+1，这个生成规则可以自定义，例如：numsForm(n*4)
         */
        def numsForm(n: BigInt): Stream[BigInt] = n #:: numsForm(n + 1)     // 定义一个元素生成规则
        val stream1 = numsForm(1)           // 创建一个Stream集合
        println(stream1)    // Stream(1, ?)
        println("head= " + stream1.head)    // 1
        println("tail= " + stream1.tail)    // Stream(2, ?)
        println(stream1)    // Stream(1, 2, ?)

        println(numsForm(5).map(multi))     // Stream(25, ?)
    }

    def multi(x: BigInt): BigInt = {
        x * x
    }
}
