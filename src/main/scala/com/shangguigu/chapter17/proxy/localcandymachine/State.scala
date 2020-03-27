package com.shangguigu.chapter17.proxy.localcandymachine

/**
 * Created by liuquan on 2020/3/26.
 */
trait State extends Serializable {
    def insertCoin()    // 插入硬币
    def returnCoin()    // 返回硬币
    def turnCrank()     // 转动手柄
    def printState()    // 输出状态
    def getStateName():String  // 返回状态名字
    def dispense()      // 分配状态。比如：卖出一块糖后，看看糖果机的当前状态是怎样
}
