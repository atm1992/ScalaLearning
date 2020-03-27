package com.shangguigu.chapter07

import scala.beans.BeanProperty

/**
 * Created by liuquan on 2020/3/4.
 */
object BankDemo {
    def main(args: Array[String]): Unit = {
        // 开户
        val account = new Account("zg112233", "张三2222",600.3, "abdee")
        println(account.query("123"))
        println(account.query("abdee"))
        println(account.withDraw("abdee", 1000))
        println(account.withDraw("abdee", 100))
        println(account.query("abdee"))
    }
}

class Account(inAccount: String,inName:String, inBalance: Double, inPwd: String) {
    // 加上private，外面只可读，不可写，保证账户安全
    @BeanProperty protected val accountNo = inAccount
    private var name = inName
    private var balance = inBalance
    private var pwd = inPwd

    judgeName
    judgebalance
    judgePwd

    def judgeName: Unit ={
        if (this.name.length<2 || this.name.length>4){
            println("姓名长度不符合要求，要求在2~4个字符")
            return
        }
    }

    def judgebalance: Unit ={
        if (this.balance<=20){
            println("余额必须大于20")
            return
        }
    }

    def judgePwd: Unit ={
        if (this.pwd.length!=6){
            println("密码的长度必须为6位")
            return
        }
    }

    // 查询余额
    def query(pwd: String): Any = {
        if (!pwd.equals(this.pwd)) {
            println("密码错误")
            return
        }
        this.balance
    }

    // 取款
    def withDraw(pwd: String, money: Double): Any = {
        if (!this.pwd.equals(pwd)) {
            println("密码错误")
            return
        }
        if (money > this.balance) {
            println("余额不足")
            return
        }
        this.balance -= money
        money
    }

    def transfer(fromAcc:Account,toAcc:Account,fromPwd:String,money:Double): Unit ={
        if (!fromAcc.pwd.equals(fromPwd)){
            println("密码错误")
            return
        }
        if (fromAcc.balance<money){
            println("余额不足")
            return
        }
        fromAcc.balance -= money
        toAcc.balance += money
        println("ok")
    }
}