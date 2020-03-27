package com.shangguigu.chapter03.arithoper

/**
 * Created by liuquan on 2020/3/1.
 */
object Demo01 {
    def main(args: Array[String]): Unit = {
        //        除法/ 的使用
        var r1: Int = 10 / 3 // 3
        println("r1=" + r1)
        var r2: Double = 10 / 3 // 3.0
        println("r2=" + r2)
        var r3: Double = 10.0 / 3 // 3.3333333333333335
        println("r3=" + r3)
        println("r3=" + r3.formatted("%.2f")) // 3.33

        //        取模% 的使用
        //        %运算的原则：a%b = a - a/b*b
        println(10 % 3) // 1
        println(-10 % 3) // -1。 -10%3 = -10 - (-10/3)*3 = -10+9=-1
        println(-10 % -3) // -1
        println(10 % -3) // 1

        //        scala中没有++和--，而使用+=1和-=1
        val remainDays = 97
        printf("统计结果为：还有个%d星期零%d天", remainDays / 7, remainDays % 7)

        val degreeF = 232.5
        val degreeC = 5.0 / 9 * (degreeF - 100)
        printf("\n对应的摄氏温度为：%f\n", degreeC)

        //        在Scala中支持代码块，返回值
        val res = {
            if (2 > 1) "true" else "false"
        }
        println("res=" + res)

        // 不使用中间变量，交换两个变量的值
        var a = 10
        var b = 8
        a = a + b // 此时的a为a+b；b还是b
        b = a - b // 此时的b为(a+b)-b，即a；a还是a+b
        a = a - b // 此时的a为(a+b)-a，即b；b为a
        println("a=" + a + "\tb=" + b)

    }
}
