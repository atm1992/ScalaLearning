package com.shangguigu.chapter16

/**
 * Created by liuquan on 2020/3/24.
 * 编写函数values(fun:(Int)=>Int,low:Int,high:Int)  // 函数形式
 * 函数values的输出为一个对偶集合。
 * 例如：values(x=>x*x,-3,3) 输出一个对偶集合(-3,9),(-2,4),(-1,1),...,(3,9)
 */
object Exercise5 {
    def main(args: Array[String]): Unit = {
        println(values(x => x * x, -3, 3))

        val arr = Array(42,5,2,7,89,322,2,0,-12)
        printf("arr数组中的最大值为：%d",arr.reduce((l,r)=>if(l>r) l else r))
    }

    def values(fun: (Int) => Int, low: Int, high: Int) = {
        var res = List[(Int, Int)]()
        low.to(high).reverse.foreach {
            // :: 运算符是从右向左运算，表示将运算符左侧的元素(或集合)插入到右侧集合的头部
            x => res = (x, fun(x)) :: res
        }
        res
    }
}
