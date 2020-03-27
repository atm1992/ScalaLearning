package com.shangguigu.chapter11

/**
 * Created by liuquan on 2020/3/20.
 */
object OperatorDemo01 {
    def main(args: Array[String]): Unit = {
        val n1 = 4
        val n2 = 5
        println(n1 + n2)
        println(n1.+(n2))   // 对操作符进行了重载，输出结果与上一句相同

        val monster = new Monster
        monster + 20    // 中置操作符
        monster.+(20)

        monster ++ ()   // 后置操作符
        monster.++

        !monster        // 前置操作符
        monster.unary_!
        println(monster.money)
    }
}

class Monster {
    var money = 0

    def +(n: Int): Unit = {     // 对操作符进行重载，中置操作符
        this.money += n
    }

    def ++(): Unit = {          // 对操作符进行重载，后置操作符
        this.money += 1
    }

    def unary_!(): Unit = {     // 对操作符进行重载，前置操作符(一元运算符)
        this.money = -this.money
    }
}