package com.shangguigu.chapter17.decorator.coffeebar.mydecorator

import com.shangguigu.chapter17.decorator.coffeebar.Drink

/**
 * Created by liuquan on 2020/3/26.
 */
// 使用一份Soy来装饰Drink类对象(单品咖啡 或 单品咖啡+调料)，然后得到Soy+单品咖啡 或 Soy+单品咖啡+调料
class Soy(obj: Drink) extends Decorator(obj) {
    super.setDescription("Soy")
    super.setPrice(1.5f)
}
