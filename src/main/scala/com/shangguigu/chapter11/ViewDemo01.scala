package com.shangguigu.chapter11

/**
 * Created by liuquan on 2020/3/20.
 */
object ViewDemo01 {
    def main(args: Array[String]): Unit = {
        // 若一个数逆序后与本身相等，则输出到结果集合
        val viewSquare1 = (1 to 10).filter(eq)      // 这里的eq函数会被调用10次
        println(viewSquare1)        // Vector(1, 2, 3, 4, 5, 6, 7, 8, 9)。这里没有使用view方法，会一次性输出所有结果

        val viewSquare2 = (1 to 10).view.filter(eq)     // 使用了view方法，此时eq函数不会立即被调用
        println(viewSquare2)        // SeqViewF(...)。输出的集合为空，因为还没使用到集合中的元素

        import scala.util.control.Breaks
        Breaks.breakable{
            for (item <- viewSquare2){
                print(item + "\t")  // 1	2	3	4	5，这里的eq函数会被调用5次
                if (item==5) Breaks.break()
            }
        }

        for (item <- viewSquare2){  // view不会缓存数据，每次执行时都要重新计算
            print(item + "\t")      // 1	2	3	4	5	6	7	8	9，这里的eq函数会被调用10次
        }
    }

    def eq(i: Int): Boolean = {
        println("eq函数被调用")
        i.toString.equals(i.toString.reverse)
    }
}
