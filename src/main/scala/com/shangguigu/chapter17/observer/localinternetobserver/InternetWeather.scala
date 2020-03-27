package com.shangguigu.chapter17.observer.localinternetobserver

/**
 * Created by liuquan on 2020/3/26.
 */
object InternetWeather {
    def main(args: Array[String]): Unit = {
        val mcurrentConditions = new CurrentConditions
        val mweatherData = new WeatherData(mcurrentConditions)
        mweatherData.setData(30,150,40)
    }
}
