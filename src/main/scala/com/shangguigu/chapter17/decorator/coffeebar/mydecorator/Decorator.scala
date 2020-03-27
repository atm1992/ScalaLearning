package com.shangguigu.chapter17.decorator.coffeebar.mydecorator

import com.shangguigu.chapter17.decorator.coffeebar.Drink

/**
 * Created by liuquan on 2020/3/26.
 */
class Decorator extends Drink { // Decorator类就是装饰者
    // 这个obj就是被装饰的对象。obj可以是单品咖啡，也可以是单品咖啡+调料
    private var obj: Drink = null

    def this(obj: Drink) = { // 辅助构造器
        this
        this.obj = obj
    }

    override def cost(): Float = {
        // 先得到自己的价格，然后递归调用cost方法获取总的费用
        super.getPrice() + obj.cost()
    }

    // 获取信息也需要递归地获取
    override def getDescription(): String = {
        super.getDescription() + " && " + obj.getDescription()
    }
}
