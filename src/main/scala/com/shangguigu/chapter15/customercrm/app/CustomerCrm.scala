package com.shangguigu.chapter15.customercrm.app

import com.shangguigu.chapter15.customercrm.view.CustomerView

/**
 * Created by liuquan on 2020/3/23.
 * 软件主入口
 */
object CustomerCrm {
    def main(args: Array[String]): Unit = {
        new CustomerView().mainMenu
    }
}
