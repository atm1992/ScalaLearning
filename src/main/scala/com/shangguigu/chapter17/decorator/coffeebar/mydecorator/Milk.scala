package com.shangguigu.chapter17.decorator.coffeebar.mydecorator

import com.shangguigu.chapter17.decorator.coffeebar.Drink

/**
 * Created by liuquan on 2020/3/26.
 */
class Milk(obj:Drink) extends Decorator(obj) {
    super.setDescription("Milk")
    super.setPrice(2.0f)
}
