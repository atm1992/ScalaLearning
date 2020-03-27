package com.shangguigu.chapter17.abstractfactory.pizzastore.pizza

/**
 * Created by liuquan on 2020/3/25.
 */
class BJPepperPizza extends Pizza {
    override def prepare(): Unit = {
        this.name = "北京胡椒披萨"
        println(this.name + " is preparing")
    }
}
