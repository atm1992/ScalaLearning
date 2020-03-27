package com.shangguigu.chapter17.factorymethod.pizzastore.pizza

/**
 * Created by liuquan on 2020/3/25.
 */
class BJGreekPizza extends Pizza {
    override def prepare(): Unit = {
        this.name = "北京希腊披萨"
        println(this.name + " is preparing")
    }
}
