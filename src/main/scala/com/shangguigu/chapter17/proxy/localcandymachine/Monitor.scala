package com.shangguigu.chapter17.proxy.localcandymachine

import scala.collection.mutable.ListBuffer

/**
 * Created by liuquan on 2020/3/26.
 */
// 用于监控糖果机的一个类
class Monitor {
    // 监控多台糖果机
    private val candyMachineList:ListBuffer[CandyMachine] = ListBuffer()

    def addMachine(mCandyMachine:CandyMachine) = {
        candyMachineList.append(mCandyMachine)
    }

    // 输出监控信息
    def report()={
//        for (mCandyMachine <- this.candyMachineList) {
//            println("Machine Loc is " + mCandyMachine.getLocation())
//            println("Machine Candy count is " + mCandyMachine.getCount())
//            println("Machine State is " + mCandyMachine.getState().getStateName())
//        }
    }
}
