package com.shangguigu.chapter04.mutlfor

import scala.io.StdIn

/**
 * Created by liuquan on 2020/3/2.
 * 1.统计三个班成绩情况，每个班有5 名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从
 * 键盘输入]。
 * 分析思路
 * (1) classNum 表示班级个数, stuNum 表示学生个数
 * (2) classScore 表示各个班级总分totalScore 表示所有班级总分
 * (3) score 表示各个学生成绩
 * (4) 使用循环的方式输入成绩
 */
object Exercise01 {
    def main(args: Array[String]): Unit = {
        val classNum = 3
        val stuNum=5
        var score=0.0
        var classScore = 0.0
        var totalScore = 0.0
        for (c<-1 to classNum){
//            先将班级总分清零
            classScore = 0.0
            for (s<-1 to stuNum){
                printf("请输入班级 %d 中的第 %d 个学生的成绩：\n",c,s)
                score = StdIn.readDouble()
                classScore+=score
            }
            totalScore+=classScore
            printf("班级 %d 的平均分为：%.2f\n",c,classScore/stuNum)
        }
        printf("所有班级的平均分为：%.2f\n",totalScore/(classNum*stuNum))
    }
}
