package com.shangguigu.chapter17.observer.observerpattern

/**
 * Created by liuquan on 2020/3/26.
 */
trait Subject {
    def registerObserver(o: Observer)

    def removeObserver(o: Observer)

    def notifyObservers()
}
