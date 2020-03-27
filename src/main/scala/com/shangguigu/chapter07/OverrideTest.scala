package com.shangguigu.chapter07

/**
 * Created by liuquan on 2020/3/5.
 */
object OverrideTest {
    def main(args: Array[String]): Unit = {
        val b1:AAAA = new BBBB
        println(b1.name)
    }
}

abstract class AAAA {
    val name: String // 抽象的var属性
    var age: Int = 10 // 普通的var属性
}

class BBBB extends AAAA {
    // 重写抽象的var属性时，加不加override关键字都可以
    val name: String = "BB"
}



