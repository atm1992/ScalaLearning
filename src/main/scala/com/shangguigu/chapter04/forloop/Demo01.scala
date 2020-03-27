package com.shangguigu.chapter04.forloop

/**
 * Created by liuquan on 2020/3/2.
 */
object Demo01 {
    def main(args: Array[String]): Unit = {
        var list = List(1, "er", true)
        for (i <- 3 to 10) {
            println(i)
        }
        for (i <- list) {
            println(i)
        }
        for (i <- 4 until 9) {
            println(i)
        }
        for (i <- 4 until 10 if i % 2 == 0) {
            println(i)
        }

        for (i <- 3 to 9; j = i - 2) {
            println(j)
        }

        for (i <- 4 to 8; j <- 2 until 4) {
            println("i*j = " + i * j)
        }

        val res = for (i <- 1 to 10) yield {
            if (i % 2 == 0) {
                i
            } else {
                "不是偶数"
            }
        }
        println(res) // Vector(不是偶数, 2, 不是偶数, 4, 不是偶数, 6, 不是偶数, 8, 不是偶数, 10)

        for (i <- 2 to 5; j = i * 2) {
            println("i=" + i + "\tj=" + j)
        }
        // 可写成以下形式
        for {
            i <- 2 to 5
            j = i * 2
        } {
            println("i=" + i + "\tj=" + j)
        }
        // Range(start, end, step) ，不包含end
        for (i <- Range(2, 8, 2)) {
            println(i)
        }
        // 输出结果与上面相同，都是 2、4、6
        for (i <- 2 until 8 if i % 2 == 0) {
            println(i)
        }
    }
}
