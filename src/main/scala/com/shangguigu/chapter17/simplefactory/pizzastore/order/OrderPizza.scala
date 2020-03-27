package com.shangguigu.chapter17.simplefactory.pizzastore.order

import com.shangguigu.chapter17.simplefactory.pizzastore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

/**
 * Created by liuquan on 2020/3/25.
 */
class OrderPizza {
    var orderType: String = _
    var pizza: Pizza = _
    breakable {
        do {
            println("请输入pizza的类型：")
            orderType = StdIn.readLine()
            pizza = SimpleFactory.createPizza(orderType)
            if (pizza == null) break()
            pizza.prepare()
            pizza.bake()
            pizza.cut()
            pizza.box()
        } while (true)
    }
}
