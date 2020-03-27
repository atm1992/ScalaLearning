package com.shangguigu.chapter08.mixin

/**
 * Created by liuquan on 2020/3/6.
 */
object AddTraits {
    def main(args: Array[String]): Unit = {
        // 创建mysql对象时，动态混入了两个特质：DB4、File4
        // 这里会先混入特质DB4，输出：Operate4...；Data4；DB4
        // 然后混入特质File4，跟上面一样，会先混入File4的父特质Data4，此时编译器在底层发现特质Data4已经混入了，
        // 所以这里不再混入特质Data4，而是直接输出特质File4中的内容：File4
        val mysql = new MySQL4 with DB4 with File4
        // 根据上面的分析，输出顺序为：Operate4...；Data4；DB4；File4
        // 从而说明：Scala在叠加特质时，特质的声明顺序为从左到右，即 先混入最左侧的特质(及其父特质)
        println(mysql)

        // 创建好 动态混入了多个特质 的对象mysql后，该对象执行方法的顺序为从右到左
        // 底层实现是个栈。创建对象时，特质从左到右入栈；执行方法时，特质从右到左出栈
        // 因此，最先执行最右侧特质File4中的insert方法，该方法中使用了super，这里的super指的是特质File4左边的特质DB4 (如果特质File4左边没有特质，则super指的是父特质Data4)
        // 所以，接下来执行特质DB4中的insert方法，该方法中也使用了super，然而特质DB4的左边已经没有了特质，因此这里的super指的是其父特质Data4
        // 所以，接下来执行特质Data4中的insert方法。结束！
        // 最终的输出为：向文件中(特质File4)；向数据库中(特质DB4)；插入数据：100(特质Data4)
        mysql.insert(100)

        println("\n修改特质声明语句中的特质顺序~\n")

        val mysql2 = new MySQL4 with File4 with DB4
        println(mysql2)
        mysql2.insert(888)
    }
}

trait Operate4 {
    println("Operate4...")

    def insert(id: Int) // 抽象方法
}

trait Data4 extends Operate4 {
    println("Data4")

    // 实现特质Operate4中的insert抽象方法，这里的override可写可不写
    override def insert(id: Int): Unit = {
        println("插入数据：" + id)
    }
}

trait DB4 extends Data4 {
    println("DB4")

    // 重写特质Data4中的insert方法，这里是重写，所以这里必须要写override
    override def insert(id: Int): Unit = {
        println("向数据库中")
        super.insert(id)
    }
}

trait File4 extends Data4 {
    println("File4")

    // 重写特质Data4中的insert方法，这里是重写，所以这里必须要写override
    override def insert(id: Int): Unit = {
        println("向文件中")
        // 难点。这里的super不一定是指父特质Data4，还要看特质声明语句中的特质顺序
        super.insert(id)
        // super[Data4].insert(id)     // 直接调用父特质Data4中的insert方法
    }
}

// 普通类
class MySQL4 {}