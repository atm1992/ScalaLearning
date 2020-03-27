package com.shangguigu.chapter15.customercrm.bean

/**
 * Created by liuquan on 2020/3/22.
 */
class Customer {
    // 属性
    var id: Int = _
    var name: String = _
    var gender: Char = _
    var age: Short = _
    var tel: String = _
    var email: String = _

    // 一般先写辅助构造器，再写主构造器。
    // 因为所有的辅助构造器都要调用主构造器，主构造器一旦确定，辅助构造器会受到影响
    // 因此这里设计一个辅助构造器
    def this(id: Int, name: String, gender: Char, age: Short, tel: String, email: String) {
        this        // 调用主构造器
        this.id = id
        this.name = name
        this.gender = gender
        this.age = age
        this.tel = tel
        this.email = email
    }

    // 再写一个辅助构造器(没有id)
    def this(name: String, gender: Char, age: Short, tel: String, email: String){
        this
        this.name = name
        this.gender = gender
        this.age = age
        this.tel = tel
        this.email = email
    }

    override def toString: String = {
        this.id + "\t\t" + this.name + "\t\t" + this.gender + "\t\t" + this.age + "\t\t" + this.tel + "\t\t" + this.email
    }

}
