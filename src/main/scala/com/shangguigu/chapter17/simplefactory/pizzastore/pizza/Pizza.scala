package com.shangguigu.chapter17.simplefactory.pizzastore.pizza

/**
 * Created by liuquan on 2020/3/25.
 */
abstract class Pizza {
    var name: String = _

    // 假设每种披萨的准备原材料不一样，因此将prepare做成抽象方法
    def prepare()

    def cut() = {
        println(this.name + "cutting ...")
    }

    def bake() = {
        println(this.name + "baking ...")
    }

    def box() = {
        println(this.name + "boxing ...")
    }
}
