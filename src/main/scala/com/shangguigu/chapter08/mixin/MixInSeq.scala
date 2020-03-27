package com.shangguigu.chapter08.mixin

/**
 * Created by liuquan on 2020/3/6.
 */
object MixInSeq {
    def main(args: Array[String]): Unit = {
        /**
         * 1、调用当前类的父类构造器
         * 2、第一个特质的父特质构造器
         * 3、第一个特质构造器
         * 4、第二个特质构造器的父特质构造器, 如果已经执行过，
         * 就不再执行
         * 5. 第二个特质构造器
         * 6. .......重复4,5 的步骤(如果有第3 个，第4 个特质)
         */
        val ff1 = new FF
        println(ff1)

        val kk = new KK with CC with DD
    }
}

trait AA {
    println("A...")
}

trait BB extends AA {
    println("B....")
}

trait CC extends BB {
    println("C....")
}

trait DD extends BB {
    println("D....")
}

class GG {
    println("G...")
}

class EE extends GG { // 普通类
    println("E...")
}

// 先继承了普通类EE，然后再继承(混入)了特质CC和特质DD
class FF extends EE with CC with DD {
    println("F....")
}

// 只继承了普通类EE
class KK extends EE {
    println("K....")
}

trait LoggedException extends Exception {
    def log(): Unit = {
        // getMessage方法来自于Exception类
        println(getMessage())
    }
}