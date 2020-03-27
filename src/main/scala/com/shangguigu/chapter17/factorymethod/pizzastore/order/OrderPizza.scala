package com.shangguigu.chapter17.factorymethod.pizzastore.order

import com.shangguigu.chapter17.factorymethod.pizzastore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

/**
 * Created by liuquan on 2020/3/25.
 */
// 将OrderPizza做成一个抽象类
abstract class OrderPizza {
    var orderType: String = _
    var pizza: Pizza = _
    breakable {
        do {
            println("请输入pizza的类型：")
            orderType = StdIn.readLine()
            pizza = createPizza(orderType)
            if (pizza == null) break()
            pizza.prepare()
            pizza.bake()
            pizza.cut()
            pizza.box()
        } while (true)
    }

    // 抽象方法。让各个子类去实现
    def createPizza(t:String):Pizza
}
