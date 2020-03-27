package com.shangguigu.chapter16

/**
 * Created by liuquan on 2020/3/25.
 * 编写函数largest(fun:(Int)=>Int,inputs:Seq[Int])，输出在给定输入序列中给定函数的最大值。
 * 即 将inputs中的各个元素传给fun函数，然后返回最大值
 * 例如：largest(x=>10*x - x*x, 1 to 10) 返回结果为25 = 10*5 - 5*5
 */
object Exercise7 {
    def main(args: Array[String]): Unit = {
        println(largest(x => 10 * x - x * x, 1 to 10))
    }

    def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
        inputs.map(fun).max
    }
}
