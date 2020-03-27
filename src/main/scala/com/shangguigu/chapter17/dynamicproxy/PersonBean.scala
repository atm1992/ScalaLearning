package com.shangguigu.chapter17.dynamicproxy

/**
 * Created by liuquan on 2020/3/26.
 */
// 这个就是Subject接口
trait PersonBean {
    def getName(): String

    def getGender(): String

    def getInterests(): String

    def getScore(): Int

    def setName(name: String)

    def setGender(gender: String)

    def setInterests(interests: String)

    def setScore(score: Int)
}
