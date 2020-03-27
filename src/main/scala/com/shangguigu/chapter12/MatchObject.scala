package com.shangguigu.chapter12

/**
 * Created by liuquan on 2020/3/20.
 */
object MatchObject {
    def main(args: Array[String]): Unit = {
        val num: Double = Square(6.0) // 这里会调用构造器apply方法，变量num的值为36.0
        num match {
            /**
             * 当匹配到case Square(n)时，会调用Square对象的unapply方法，将变量n的值传给unapply方法。这里的n是一个变量，它的值为num
             * 若对象提取器unapply方法返回的是一个Some类型实例Some(?)，则表示匹配成功。同时会将Some(?)中的值?赋给变量n
             */
            case Square(n) => println(n)
            case _ => println("nothing matched")
        }
    }
}

object Square {
    /**
     * unapply方法是对象提取器，传入的参数为z: Double，其实传入的参数名、参数类型都可以随便自定义
     * 返回值类型为Option[Double]，Option类型有两个可选实例：Some子类的实例、None对象
     * 这里的返回值为Some(math.sqrt(z))，表示将值math.sqrt(z)传给Some类的构造器，从而返回一个Some类型的实例
     */
    def unapply(z: Double): Option[Double] = {
        println("unapply方法被调用")
        Some(math.sqrt(z) + 44)
    }

    def apply(z: Double): Double = z * z
}
