package com.shangguigu.chapter08

/**
 * Created by liuquan on 2020/3/5.
 */

/**
 * 有一群小孩在玩堆雪人,不时有新的小孩加入,请问如何知道现在共有多少人在玩?请使用面向
 * 对象的思想，编写程序解决。
 */
object ChildGame {
    def main(args: Array[String]): Unit = {
        val c1 = new Child01("111")
        val c2 = new Child01("222")
        val c3 = new Child01("333")
        Child01.joinGame(c1)
        Child01.joinGame(c2)
        Child01.joinGame(c3)
        Child01.showNum
    }
}

class Child01(inName: String) {
    var name = inName
}

object Child01 {
    var totalChildNum = 0

    def joinGame(child: Child01): Unit = {
        printf("%s 小孩加入了游戏\n", child.name)
        totalChildNum += 1
    }

    def showNum: Unit = {
        println("当前的小孩个数为：" + totalChildNum)
    }
}