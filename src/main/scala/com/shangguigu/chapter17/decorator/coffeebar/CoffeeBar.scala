package com.shangguigu.chapter17.decorator.coffeebar

import com.shangguigu.chapter17.decorator.coffeebar.mycoffee.{Decaf, LongBlack}
import com.shangguigu.chapter17.decorator.coffeebar.mydecorator.{Chocolate, Milk}

/**
 * Created by liuquan on 2020/3/26.
 */
object CoffeeBar {
    def main(args: Array[String]): Unit = {
        println("欢迎来到咖啡馆")
        val order1: Drink = new Decaf // 点Decaf单品咖啡
        println("order1 price: " + order1.cost())
        println("order1 desc: " + order1.getDescription())

        println("-----------------------------------------")

        // 点一份LongBlack，并加入一份Milk 以及 两份Chocolate
        var order2: Drink = new LongBlack // 5.0
        order2 = new Milk(order2) // 2.0
        order2 = new Chocolate(order2) // 3.0
        order2 = new Chocolate(order2) // 3.0
        println("order2 price: " + order2.cost()) // 13.0
        println("order2 desc: " + order2.getDescription())
    }
}
