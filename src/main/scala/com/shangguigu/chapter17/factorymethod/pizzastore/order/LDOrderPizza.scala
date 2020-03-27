package com.shangguigu.chapter17.factorymethod.pizzastore.order

import com.shangguigu.chapter17.factorymethod.pizzastore.pizza.{LDGreekPizza, LDPepperPizza, Pizza}

/**
 * Created by liuquan on 2020/3/25.
 */
class LDOrderPizza extends OrderPizza {
    override def createPizza(t: String): Pizza = {
        var pizza: Pizza = null
        if (t.equals("greek")) {
            pizza = new LDGreekPizza
        } else if (t.equals("pepper")) {
            pizza = new LDPepperPizza
        }
        pizza
    }
}
