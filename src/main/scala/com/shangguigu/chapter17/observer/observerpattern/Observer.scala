package com.shangguigu.chapter17.observer.observerpattern

/**
 * Created by liuquan on 2020/3/26.
 */
trait Observer {
    // 抽象方法。等待其他第三方公司(Observer)去实现
    def update(mTemperature: Float, mPressure: Float, mHumidity: Float)
}
