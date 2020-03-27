package com.shangguigu.chapter17.simplefactory.pizzastore.pizza

/**
 * Created by liuquan on 2020/3/25.
 */
class PepperPizza extends Pizza {
    override def prepare(): Unit = {
        this.name = "胡椒披萨"
        println(this.name + " is preparing")
    }
}
