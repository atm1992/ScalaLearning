package com.shangguigu.chapter17.observer.localinternetobserver

/**
 * Created by liuquan on 2020/3/26.
 */
// 气象局的天气公告板
class CurrentConditions {
    private var mTemperature: Float = _     // 温度
    private var mPressure: Float = _        // 气压
    private var mHumidity: Float = _        // 湿度
    def display() = {
        println("Today mTemperature is " + mTemperature)
        println("Today mPressure is " + mPressure)
        println("Today mHumidity is " + mHumidity)
    }

    // 更新气象局的天气公告板上的天气数据
    def update(mTemperature: Float, mPressure: Float, mHumidity: Float) = {
        this.mTemperature = mTemperature
        this.mPressure = mPressure
        this.mHumidity = mHumidity
        display()
    }
}
