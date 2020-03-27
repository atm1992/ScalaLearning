package com.shangguigu.chapter17.simplefactory.pizzastore.order

import com.shangguigu.chapter17.simplefactory.pizzastore.pizza.{GreekPizza, PepperPizza, Pizza}

/**
 * Created by liuquan on 2020/3/25.
 */
object SimpleFactory {
    // 提供了一个创建Pizaa对象的方法。在需要创建Pizaa对象时调用该方法即可
    def createPizza(t: String): Pizza = {
        var pizza: Pizza = null
        if (t.equals("greek")) {
            pizza = new GreekPizza
        } else if (t.equals("pepper")) {
            pizza = new PepperPizza
        }
        pizza
    }
}
