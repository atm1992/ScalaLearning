package com.shangguigu.chapter07

import scala.beans.BeanProperty

object PackageDemo3 {
    def main(args: Array[String]): Unit = {
        val m1 = new Manager
        println("name: " + m1.name + "\naddress: " + m1.address + "\ncompany: " + m1.company)
    }
}

class Manager {
    @BeanProperty var name: String = "相对路径。但需要import scala.beans.BeanProperty"
    @scala.beans.BeanProperty var address: String = "这也是相对路径。但不需要额外的import"
    @_root_.scala.beans.BeanProperty var company: String = "绝对路径。可以解决包名冲突"
}