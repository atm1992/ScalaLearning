package com.shangguigu.chapter12

/**
 * Created by liuquan on 2020/3/20.
 */
object MatchObject2 {
    def main(args: Array[String]): Unit = {
        val namesString = "Alice,Bob,Thomas"
        namesString match {
            /**
             * 当匹配到Names(first, second, third)时，因为传入的参数个数多于1，因此这里会调用Names对象的unapplySeq方法
             * 将字符串"Alice,Bob,Thomas"传给unapplySeq方法的形参str，若返回的是Some("Alice"，"Bob"，"Thomas")，则表示匹配成功，
             * 并将("Alice"，"Bob"，"Thomas")分别赋给(first, second, third)这三个变量
             * 注意：unapplySeq方法返回值的个数 要与 这里的变量(first, second, third)个数相同，否则匹配失败
             */
            case Names(first, second, third) => {
                println("the string contains three people's names")
                println(s"$first $second $third")
            }
            case _ => println("nothing matched")
        }
    }
}

object Names {
    // 当构造器的传入参数多于1时，就会触发这个对象提取器
    def unapplySeq(str: String): Option[Seq[String]] = {
        if (str.contains(",")) Some(str.split(","))
        else None
    }
}