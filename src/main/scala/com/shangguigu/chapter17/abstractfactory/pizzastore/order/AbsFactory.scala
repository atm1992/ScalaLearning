package com.shangguigu.chapter17.abstractfactory.pizzastore.order

import com.shangguigu.chapter17.abstractfactory.pizzastore.pizza.Pizza

/**
 * Created by liuquan on 2020/3/25.
 */
trait AbsFactory {
    // 抽象方法。让各个子类去实现
    def createPizza(t: String): Pizza
}
