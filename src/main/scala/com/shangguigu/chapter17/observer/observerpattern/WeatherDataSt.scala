package com.shangguigu.chapter17.observer.observerpattern

import scala.collection.mutable.ListBuffer

/**
 * Created by liuquan on 2020/3/26.
 */
class WeatherDataSt extends Subject {
    private var mTemperature: Float = _ // 温度
    private var mPressure: Float = _ // 气压
    private var mHumidity: Float = _ // 湿度
    // 一个集合。用于管理所有的观察者
    private var mObservers: ListBuffer[Observer] = ListBuffer()

    def getTemperature() = mTemperature

    def getPressure() = mPressure

    def getHumidity() = mHumidity

    // 将最新的天气数据update给mCurrentConditions
    def dataChange() = notifyObservers()

    // 设置最新的天气数据
    def setData(mTemperature: Float, mPressure: Float, mHumidity: Float) = {
        this.mTemperature = mTemperature
        this.mPressure = mPressure
        this.mHumidity = mHumidity
        dataChange() // 修改观察者天气公告板上的天气数据
    }

    override def registerObserver(o: Observer): Unit = {
        mObservers.append(o)
    }

    override def removeObserver(o: Observer): Unit = {
        if (mObservers.contains(o)) {
            mObservers -= o
        }
    }

    // 当天气情况发生了改变时，就通知所有的观察者
    override def notifyObservers(): Unit = {
        for (observer <- mObservers) {
            observer.update(mTemperature, mPressure, mHumidity)
        }
    }
}
