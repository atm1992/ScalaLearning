package com.shangguigu.chapter17.observer.observerpattern

/**
 * Created by liuquan on 2020/3/26.
 */
object InternetWeather extends App {
    val mWeatherDataSt = new WeatherDataSt

    // 创建一个气象局的天气公告板对象(Observer, 观察者)
    val mCurrentConditions = new CurrentConditions
    mWeatherDataSt.registerObserver(mCurrentConditions)

    // 创建一个新浪的天气公告板对象(Observer, 观察者)
    val sinaCurrentConditions = new SinaCurrentConditions
    mWeatherDataSt.registerObserver(sinaCurrentConditions)

    mWeatherDataSt.setData(30, 150, 40)
}
