package com.shangguigu.chapter17.decorator.coffeebar

/**
 * Created by liuquan on 2020/3/26.
 */
abstract class Drink {
    var description = ""
    private var price = 0.0f

    def setDescription(description: String) = {
        this.description = description
    }

    def getDescription(): String = {
        description + " 价格为：" + getPrice()
    }

    def getPrice(): Float = {
        price
    }

    def setPrice(price: Float) = {
        this.price = price
    }

    // 将计算成本的方法做成抽象的，因为还不知道是什么Drink，所以还不确定要怎么计算
    def cost(): Float
}