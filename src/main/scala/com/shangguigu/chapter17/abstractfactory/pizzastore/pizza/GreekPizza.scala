package com.shangguigu.chapter17.abstractfactory.pizzastore.pizza

/**
 * Created by liuquan on 2020/3/25.
 */
class GreekPizza extends Pizza {
    override def prepare(): Unit = {
        this.name = "希腊披萨"
        println(this.name + " is preparing")
    }
}
