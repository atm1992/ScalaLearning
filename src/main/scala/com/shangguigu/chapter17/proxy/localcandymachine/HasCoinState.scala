package com.shangguigu.chapter17.proxy.localcandymachine

/**
 * Created by liuquan on 2020/3/26.
 */
// 用户插入一块硬币后的状态
//class HasCoinState extends State {
//    // @transient 用于注解将字段标记为瞬态的，即 表示某个属性不是该对象串行化的一部分
//    @transient private var mCandyMachine:CandyMachine = _
//
//    // 监控的是mCandyMachine这个糖果机的状态
//    def this(mCandyMachine:CandyMachine)={
//        this
//        this.mCandyMachine = mCandyMachine
//    }
//    override def insertCoin(): Unit = println("you can't insert another coin")
//
//    override def returnCoin(): Unit = {
//        println("coin return")
//        mCandyMachine.setState(mCandyMachine.mOnReadyState)
//    }
//
//    // 转动手柄
//    override def turnCrank(): Unit = {
//        println("crank turn ...")
//        val randomWinner = new java.util.Random()
//        // 返回一个10以内的随机整数。若该数为0，则再奖励一块糖果
//        val winner = randomWinner.nextInt(10)
//        if (winner==0){
//            mCandyMachine.setState(mCandyMachine.mWinnerState)
//        }else{
//            mCandyMachine.setState(mCandyMachine.mSoldState)
//        }
//    }
//
//    override def printState(): Unit = println("--- HasCoin ---")
//
//    override def getStateName(): String = "HasCoin State"
//
//    override def dispense(): Unit = {}
//}
