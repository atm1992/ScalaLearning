package com.shangguigu.chapter17.decorator.coffeebar.mycoffee

import com.shangguigu.chapter17.decorator.coffeebar.Drink

/**
 * Created by liuquan on 2020/3/26.
 */
// 这里的Coffee类就是抽象类Drink(Component)与各个单品咖啡类(ConcreteComponent) 之间的一个缓冲层
// 之所以做一个缓冲层，是以防将来要扩展新的Drink种类，而不只是现在的Coffee大类，也许将来还可能会有果汁大类
// 若只是针对当前案例，这个缓冲层可以不需要
class Coffee extends Drink {
    override def cost(): Float = {
        super.getPrice()
    }
}
