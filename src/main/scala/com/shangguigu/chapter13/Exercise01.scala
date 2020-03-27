package com.shangguigu.chapter13

/**
 * Created by liuquan on 2020/3/21.
 */
object Exercise01 {
    def main(args: Array[String]): Unit = {
        // 将集合list中的所有数字都+1，并返回一个新的集合。忽略掉非数字的元素
        val list = List(1, 2, 3, 4, "abc")

        // 思路1：先filter，再map
        // 之所以过滤完还需要再转换一次数据类型，是因为list的类型为Any，因此需要将Any先转换为Int
        val res = list.filter(_.isInstanceOf[Int]).map(_.asInstanceOf[Int]).map(_ + 1)
        println(res)

        // 思路2：模式匹配(类型匹配)
        def addOne(i: Any): Any = {
            i match {
                case x: Int => x + 1
                case _ =>
            }
        }

        val res2 = list.map(addOne).filter(_.isInstanceOf[Int])
        println(res2)

        // 思路3：偏函数
        /**
         * [Any,Int] 表示偏函数接收的参数类型为Any，返回值类型为Int
         * isDefinedAt(x: Any) 若返回true，则调用apply方法去构建对象实例；若返回false，则不构建对象，即 过滤掉传入的参数x
         * apply(v1: Any)构造器 对传入的值v1 +1，并返回一个新的集合
         */
        val partialFunc = new PartialFunction[Any, Int] {       // 定义一个偏函数
            override def isDefinedAt(x: Any): Boolean = x.isInstanceOf[Int]

            override def apply(v1: Any): Int = {
                v1.asInstanceOf[Int] + 1
            }
        }

        /**
         * 偏函数的执行流程：
         * 对于此案例，偏函数中的isDefinedAt方法会被调用5次，apply方法会被调用4次
         * 1、遍历list中的所有元素，以第一个元素a为例
         * 2、将a传入isDefinedAt方法
         * 3、若返回true，则调用apply方法，将a传入apply方法，然后得到一个返回值，将该值放入一个新的集合
         * 4、若返回false，则不会调用apply方法
         * 5、遍历list的下一个元素 …… 遍历完所有的元素后，返回结果集合
         */
        // 使用偏函数。若使用偏函数，则不能使用map操作，而应使用collect。map没有过滤机制，collect有点类似map和filter的结合体
        val res3 = list.collect(partialFunc)
        println(res3)
    }
}
