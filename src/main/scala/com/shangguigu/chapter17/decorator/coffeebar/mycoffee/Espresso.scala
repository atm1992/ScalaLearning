package com.shangguigu.chapter17.decorator.coffeebar.mycoffee

/**
 * Created by liuquan on 2020/3/26.
 */
// 这个就是单品咖啡类，也就是装饰者模式中的ConcreteComponent
class Espresso extends Coffee {
    // 使用主构造器
    super.setDescription("Espresso")
    super.setPrice(6.0f)
}
