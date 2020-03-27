package com.shangguigu.chapter17.factorymethod.pizzastore.order

import com.shangguigu.chapter17.factorymethod.pizzastore.pizza.{BJGreekPizza, BJPepperPizza, Pizza}

/**
 * Created by liuquan on 2020/3/25.
 */
class BJOrderPizza extends OrderPizza {
    override def createPizza(t: String): Pizza = {
        var pizza: Pizza = null
        if (t.equals("greek")) {
            pizza = new BJGreekPizza
        } else if (t.equals("pepper")) {
            pizza = new BJPepperPizza
        }
        pizza
    }
}
