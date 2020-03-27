package com.shangguigu.chapter17.observer.localinternetobserver

/**
 * Created by liuquan on 2020/3/26.
 */
// WeatherData类可理解为气象局维护的一个提供天气数据的核心类
class WeatherData {
    private var mTemperature: Float = _ // 温度
    private var mPressure: Float = _ // 气压
    private var mHumidity: Float = _ // 湿度
    // 气象局的天气公告板，用来发布天气情况
    private var mCurrentConditions: CurrentConditions = _

    // 构建WeatherData类的对象时，传入一个CurrentConditions的对象
    def this(mCurrentConditions: CurrentConditions) = {
        this
        this.mCurrentConditions = mCurrentConditions
    }

    def getTemperature() = {
        mTemperature
    }

    def getPressure() = {
        mPressure
    }

    def getHumidity() = {
        mHumidity
    }

    // 将最新的天气数据update给mCurrentConditions
    def dataChange() = {
        mCurrentConditions.update(getTemperature(), getPressure(), getHumidity())
    }

    // 设置最新的天气数据
    def setData(mTemperature: Float, mPressure: Float, mHumidity: Float) = {
        this.mTemperature = mTemperature
        this.mPressure = mPressure
        this.mHumidity = mHumidity
        dataChange() // 修改气象局的天气公告板上的天气数据
    }
}
