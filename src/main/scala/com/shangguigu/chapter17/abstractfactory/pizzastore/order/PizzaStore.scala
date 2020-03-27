package com.shangguigu.chapter17.abstractfactory.pizzastore.order

/**
 * Created by liuquan on 2020/3/25.
 */
object PizzaStore {
    def main(args: Array[String]): Unit = {
        new OrderPizza(new BJFactory)
        // new OrderPizza(new LDFactory)
    }
}
