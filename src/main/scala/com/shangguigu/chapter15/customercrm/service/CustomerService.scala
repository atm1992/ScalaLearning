package com.shangguigu.chapter15.customercrm.service

import com.shangguigu.chapter15.customercrm.bean.Customer

import scala.collection.mutable.ListBuffer
import util.control.Breaks._

/**
 * Created by liuquan on 2020/3/23.
 */
class CustomerService {
    var customerNum = 1

    // customers集合用于存放客户信息
    val customers = ListBuffer(new Customer(1,"tom",'男',10,"110","tom@126.com"))
    // 返回当前系统有哪些客户
    def list():ListBuffer[Customer]={
        this.customers
    }

    // 添加客户
    def add(customer: Customer):Boolean={
        // 设置客户id
        customerNum += 1
        customer.id = customerNum
        customers.append(customer)
        true
    }

    def del(id:Int):Boolean={
        val index = findIndexByID(id)
        if (id != -1) {
            customers.remove(index)     // 删除ListBuffer中指定索引位置上的Customer对象
            true
        } else {
            false
        }

    }

    // 根据客户id查找index
    def findIndexByID(id:Int) ={
        var index = -1      // 默认为-1。若找到了对应的customer，则修改为customer对应的index
        breakable {
            for (i <- 0 until customers.length) {
                if (customers(i).id == id) {
                    index = i
                    break()
                }
            }
        }
        index
    }
}
