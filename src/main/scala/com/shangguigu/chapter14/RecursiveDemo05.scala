package com.shangguigu.chapter14

/**
 * Created by liuquan on 2020/3/22.
 * 求斐波那契数列
 */
object RecursiveDemo05 {
    def main(args: Array[String]): Unit = {
        var count = BigInt(0)
        println(fbn(15))
        println("递归调用的次数为：" + count)

        // 使用递归求斐波那契数列
        def fbn(n: BigInt): BigInt = {
            count += 1
            if (n == 1 || n == 2) 1
            else fbn(n - 1) + fbn(n - 2)        // 这里会出现大量的重复计算，需要对递归进行优化，例如：将递归转换为循环
        }
    }
}
