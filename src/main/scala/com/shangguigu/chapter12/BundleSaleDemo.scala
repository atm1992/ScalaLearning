package com.shangguigu.chapter12

/**
 * Created by liuquan on 2020/3/21.
 */
object BundleSaleDemo {
    def main(args: Array[String]): Unit = {
        // 表示有一捆书籍，包含一本漫画和一捆文学作品，这一捆文学作品中又包含了一本阳关和一本围城
        // 这里在一个Bundle实例中又嵌套了另一个Bundle实例，这是一个嵌套结构
        // 在外层的Bundle实例中，10表示折扣金额，即 漫画这本书的实际售价为 40 - 10 = 30
        // 在里面的Bundle实例中，20表示折扣金额，即 这一捆文学作品的实际售价为 80 + 30 - 20 = 90
        // 因此，整个sale对象的实际售价为 30 + 90 = 120
        val sale = Bundle("书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)))

        // 上面是计算思路，下面用模式匹配来匹配这个嵌套结构，从而自动计算出实际售价
        val res = sale match {
            case Bundle(_, _, Book(desc, price), _*) => (desc, price)
        }
        println(res._1 + " " + res._2) // 这里用对象匹配来获取漫画这本书的价格


        // 通过@表示法将嵌套的值绑定到变量。这里将Book(_, _)匹配到的部分赋给变量art，将_*匹配到的部分赋给变量rest
        val res2 = sale match {
            case Bundle(_, _, art@Book(_, _), rest@_*) => (art, rest)
        }
        println(res2)
        println("art= " + res2._1) // Book(漫画,40.0)
        // 这里之所以显示是WrappedArray，是因为用 _* 匹配的，程序认为后面会有多个Bundle，所以用一个数组包裹起来
        println("rest= " + res2._2) // WrappedArray(Bundle(文学作品,20.0,WrappedArray(Book(《阳关》,80.0), Book(《围城》,30.0))))


        // 去掉变量rest最外层的WrappedArray，只需在匹配时将 _* 换成 _ ，表示只匹配后面一个元素(即 后面的一个Bundle)，因此就不需要再使用数组包裹起来了
        val res3 = sale match {
            case Bundle(_, _, art@Book(_, _), rest@_) => (art, rest)
        }
        // 至于Bundle内部的WrappedArray，是因为该Bundle中有两个Book，所以会自动使用WrappedArray将这两个Book包裹起来
        println("rest= " + res3._2) // Bundle(文学作品,20.0,WrappedArray(Book(《阳关》,80.0), Book(《围城》,30.0)))

        println("最终售价为：" + getPrice(sale))      // 120.0
    }

    // 这里的item参数的类型为Item，因此可传入Book类实例和Bundle类实例，因为Item类是它们的父类
    def getPrice(item: Item): Double = {
        item match {
            case Book(_, p) => p // 若只有一本书，则直接返回该书的价格
            // 若是一捆书，则通过递归来计算这捆书的最终售价。
            // _* 匹配到的是一个数组，该数组在进行map操作时，若当前元素为Bundle，则递归进入case Bundle分支；
            // 若当前元素为Book，则递归进入case Book分支
            case Bundle(_, discount, items@_*) => items.map(getPrice).sum - discount
        }
    }
}

abstract class Item {}

case class Book(description: String, price: Double) extends Item {}

// 捆绑销售样例类。discount 表示当前捆绑商品的折扣，item 是一个可变参数，可以有一个或多个商品
// 这里的item参数的类型为Item，而Book类和Bundle类都是Item类的子类，因为可将子类的实例传给父类的引用，
// 所以这里的item参数可以传入Book类实例和Bundle类实例，因此可以实现一个Bundle的嵌套结构
case class Bundle(description: String, discount: Double, item: Item*) extends Item {}

