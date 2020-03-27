package com.shangguigu.chapter17.abstractfactory.pizzastore.order
import com.shangguigu.chapter17.abstractfactory.pizzastore.pizza.{BJGreekPizza, BJPepperPizza, Pizza}

/**
 * Created by liuquan on 2020/3/25.
 */
class BJFactory extends AbsFactory {
    // 这是一个实现了trait AbsFactory 的工厂子类
    // 若以后希望订购北京的pizza，则使用该工厂子类即可
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
