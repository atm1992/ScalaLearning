package com.shangguigu.chapter08.mytrait

/**
 * Created by liuquan on 2020/3/6.
 */
object TraitDemo04 {
    def main(args: Array[String]): Unit = {
        val mySQL5 = new MySQL5 with DB5 with File5
        // 这里可以正常运行。这里File5.insert中super指的是特质DB5，DB5中的insert方法是个普通方法，因此可以正常运行
        mySQL5.insert(5)
    }
}

trait Operate5 {
    def insert(id: Int)
}

trait File5 extends Operate5 {
    // 若在特质中重写/实现父特质中的抽象方法时，在实现的方法体中使用super调用了父特质的抽象方法，
    // 则此时并没有完全实现该抽象方法，因此需要加上abstract override，等于是明确告诉编译器，
    // 该方法确实重写了父特质中的抽象方法，但是重写了之后，该方法仍是一个抽象方法(因为没有完全实现，需要其它特质继续去实现)
    // 如果不加abstract override，则会运行报错
    abstract override def insert(id: Int): Unit = {
        println("将数据保存到文件中")
        // 这里的super.insert并非一定不能运行，在动态混入时，super有可能指的是左边的特质，从而调用该特质中的insert普通方法
        super.insert(id)
    }
}

trait DB5 extends Operate5 {
    override def insert(id: Int): Unit = {
        println("将数据保存到数据库中")
    }
}

class MySQL5 {}
