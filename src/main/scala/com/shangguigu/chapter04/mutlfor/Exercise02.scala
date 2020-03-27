package com.shangguigu.chapter04.mutlfor

import scala.io.StdIn

/**
 * Created by liuquan on 2020/3/2.
 * 统计三个班及格人数，每个班有5 名同学。
 */
object Exercise02 {
    def main(args: Array[String]): Unit = {
        val classNum = 3
        val stuNum = 5
        var passNum = 0
        var totalPassNum = 0
        var score = 0.0
        for (c <- 1 to classNum) {
            passNum = 0
            for (s <- 1 to stuNum) {
                printf("请输入第 %d 个班级中第 %d 个学生的成绩：\n", c, s)
                score = StdIn.readDouble()
                if (score >= 60) {
                    passNum += 1
                }
            }
            printf("第 %d 个班级的及格人数为：%d\n", c, passNum)
            totalPassNum += passNum
        }
        printf("所有班级的及格总人数为：%d", totalPassNum)
    }
}
