package com.shangguigu.chapter08.homework

/**
 * Created by liuquan on 2020/3/6.
 */
object Exercise03 {
    def main(args: Array[String]): Unit = {
        // 使用 type 给类型Int取别名为MyInt
        type MyInt = Int
        val num1:MyInt = 1
        println(num1)

        println("----------------------")
        println(Suits)
        println(Suits.isRed(Suits.heart))
        println(Suits.isRed(Suits.spade))
    }
}


object Suits extends Enumeration {
    type Suits = Value
    val club = Value("梅花")
    val spade = Value("黑桃")
    val diamond = Value("方块")
    val heart = Value("红心")

    override def toString(): String = {
        Suits.values.mkString(",")
    }

//    def isRed(card:Suits): Boolean ={
//        if (card == diamond || card==heart){
//            true
//        }else{
//            false
//        }
//    }

    def isRed(card:Suits) = {card == diamond || card==heart}

}