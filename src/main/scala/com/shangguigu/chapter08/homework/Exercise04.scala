package com.shangguigu.chapter08.homework

/**
 * Created by liuquan on 2020/3/6.
 */
object Exercise04 {
    def main(args: Array[String]): Unit = {
//        val acc = new CheckingAcc(100)
//        println("当前余额为：" + acc.query)     // 100.0
//        acc.withdraw(10)
//        println("当前余额为：" + acc.query)     // 100.0 - 10 - 1 = 89.0
//        acc.deposit(10)
//        println("当前余额为：" + acc.query)     // 89.0 + 10 - 1 = 98.0

        val acc2 = new SavingAcc(100)
        println("当前余额为：" + acc2.query)      // 100.0
        acc2.earnMonthlyInterest                // 生成1%的利息，即 100.0 * 1% = 1 元
        println("当前余额为：" + acc2.query)      // 100.0 + 1.0 = 101.0
        acc2.withdraw(10)           // 取款10元，不收手续费，还剩91.0元
        acc2.withdraw(10)           // 取款10元，不收手续费，还剩81.0元
        acc2.withdraw(10)           // 取款10元，不收手续费，还剩71.0元
        println("当前余额为：" + acc2.query)  // 71.0
        acc2.withdraw(10)           // 取款10元，开始收手续费了，每次1元，还剩60.0元
        println("当前余额为：" + acc2.query)  // 60.0
    }
}

class BankAcc(initBalance:Double){
    private var balance = initBalance
    // 存款
    def deposit(amount:Double) = {balance+=amount;balance}
    // 取款
    def withdraw(amount:Double) = {balance-=amount;balance}
    def query = balance
}

class CheckingAcc(initBalance:Double) extends BankAcc(initBalance:Double){
    // 存款需要手续费1元，所以存入的钱减1，相当于少存了1元
    override def deposit(amount: Double): Double = super.deposit(amount-1)
    // 取款也需要手续费1元，所以取出的钱加1，相当于多取了1元
    override def withdraw(amount: Double): Double = super.withdraw(amount+1)
}

class SavingAcc(initBalance:Double) extends BankAcc(initBalance:Double){
    private var num:Int = _         // 免手续费的次数
    def earnMonthlyInterest: Unit ={        // 每个月初，系统调用该方法计算利息
        num = 3         // 初始化免手续费次数
        val curBalance:Double = super.query
        super.deposit(curBalance * 0.01)      // 每个月产生1%的利息
    }

    override def deposit(amount: Double): Double = {
        num -= 1
        if (num<0){
            // 存款收1元手续费
            super.deposit(amount-1)
        }else{
            super.deposit(amount)
        }
    }

    override def withdraw(amount: Double): Double = {
        num-=1
        if (num<0){
            // 取款收1元手续费
            super.withdraw(amount+1)
        }else{
            super.withdraw(amount)
        }
    }
}