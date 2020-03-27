package com.shangguigu.chapter07

/**
 * Created by liuquan on 2020/3/5.
 */
object ScalaAnonymousSubClass {
    def main(args: Array[String]): Unit = {
        val a2 = new ScalaA2 {
            def cry(): Unit = {
                println("cry ...")
            }

            var name: String = _
        }
        a2.cry()
    }
}

abstract class ScalaA2 {
    var name: String

    def cry()
}