package com.shangguigu.chapter14


/**
 * Created by liuquan on 2020/3/22.
 */
object RecursiveDemo01 {
    def main(args: Array[String]): Unit = {
        val (start, end) = (BigInt(1), BigInt(99999999L))
        println("while循环执行前的时间为：" + getNowDate)
        var res1 = BigInt(0)
        var num1 = start
        while (num1 <= end) {
            res1 += num1
            num1 += 1
        }
        println("res= " + res1)         // 使用循环，耗时6秒
        println("while循环执行完毕的时间为：" + getNowDate)

        println("递归执行前的时间为：" + getNowDate)
        println(mx(start, BigInt(0)))   // 使用递归，耗时也是6秒
        println("递归执行完毕的时间为：" + getNowDate)
    }

    def getNowDate() = {
        import java.util.Date
        import java.text.SimpleDateFormat
        val now: Date = new Date()
        val dataFormat: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        dataFormat.format(now)
    }

    def mx(num: BigInt, sum: BigInt): BigInt = {
        if (num <= 99999999L) mx(num + 1, sum + num)
        else sum
    }
}
