package com.shangguigu.chapter17.decorator.coffeebar.mydecorator

import com.shangguigu.chapter17.decorator.coffeebar.Drink

/**
 * Created by liuquan on 2020/3/26.
 */
class Chocolate(obj:Drink) extends Decorator(obj) {
    super.setDescription("Chocolate")
    super.setPrice(3.0f)
}
