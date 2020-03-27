package com.shangguigu.chapter17.abstractfactory.pizzastore.order

import com.shangguigu.chapter17.abstractfactory.pizzastore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

/**
 * Created by liuquan on 2020/3/25.
 */

/**
 * 使用抽象工厂模式后，订购一个pizza的思路为：
 * 1、接收一个工厂子类的实例对象，根据该子工厂的创建要求进行实例化
 * 2、
 */
class OrderPizza {
    var absFactory: AbsFactory = _

    def this(absFactory: AbsFactory) { // 辅助构造器。实现参数多态
        this
        breakable {
            var orderType: String = null
            var pizza: Pizza = null
            do {
                println("请输入pizza的类型：")
                orderType = StdIn.readLine()
                pizza = absFactory.createPizza(orderType)
                if (pizza == null) break()
                pizza.prepare()
                pizza.bake()
                pizza.cut()
                pizza.box()
            } while (true)
        }

    }
}
