package com.shangguigu.chapter15.customercrm.view

import com.shangguigu.chapter15.customercrm.bean.Customer
import com.shangguigu.chapter15.customercrm.service.CustomerService

import scala.io.StdIn

/**
 * Created by liuquan on 2020/3/23.
 */
class CustomerView {
    var loop = true     // 定义一个循环变量，控制是否退出while循环
    var key:Char = _       // 定义一个key，用于接收用户输入的选项
    val customerService = new CustomerService
    def mainMenu: Unit ={
        do {
            println("---------------------客户信息管理软件---------------------")
            println("                       1 添加客户")
            println("                       2 修改客户")
            println("                       3 删除客户")
            println("                       4 客户列表")
            println("                       5 退    出")
            println("请选择(1-5)：")
            key = StdIn.readChar()
            key match {
                case '1' => this.add()
                case '2' => println("修改客户")
                case '3' => this.del()
                case '4' => this.list()
                case '5' => loop = false
            }
        }while(loop)
        println("你退出了软件系统……")
    }

    def list()={
        println("---------------------客户列表---------------------")
        println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱")

        /**
         * for循环遍历
         * 1、获取CustomerService中的 customers ListBuffer
         */
        val customers = customerService.list()
        for (customer <- customers){
            // 重写Customer类的toString方法，返回格式化后的客户信息
            println(customer)
        }
        println("---------------------客户列表完成---------------------")
    }

    def add(): Unit ={
        println("---------------------添加客户---------------------")
        println("姓名：")
        val name = StdIn.readLine()
        println("性别：")
        val gender = StdIn.readChar()
        println("年龄：")
        val age = StdIn.readShort()
        println("电话：")
        val tel = StdIn.readLine()
        println("邮箱：")
        val email = StdIn.readLine()

        // 构建对象
        val customer = new Customer(name,gender,age,tel,email)
        customerService.add(customer)
        println("---------------------添加客户成功---------------------")
    }

    def del():Unit={
        println("---------------------删除客户---------------------")
        println("请输入待删除客户的id（-1退出）：")
        val id = StdIn.readInt()
        if (id == -1){
            println("---------------------没有删除任何客户---------------------")
            return
        }
        var isContinue = false
        do {
            println("确认是否删除(Y/N)：")
            val flag = StdIn.readChar().toLower

            if (flag == 'y' && customerService.del(id)) {
                println("---------------------删除客户完成---------------------")
            }else if (flag == 'y' || flag == 'n') {
                println("---------------------没有删除任何客户---------------------")
            }else{
                isContinue = true
            }
        } while(isContinue)
    }
}
