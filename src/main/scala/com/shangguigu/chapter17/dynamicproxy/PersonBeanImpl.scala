package com.shangguigu.chapter17.dynamicproxy

/**
 * Created by liuquan on 2020/3/26.
 */
// 这个就是RealSubject类，真正被调用的对象
class PersonBeanImpl extends PersonBean {
    var name = ""
    var gender = ""
    var interests = ""
    var score: Int = _

    override def getName(): String = name

    override def getGender(): String = gender

    override def getInterests(): String = interests

    override def getScore(): Int = score

    // 自己能调用，别人不能调用
    override def setName(name: String): Unit = {
        this.name = name
    }

    // 自己能调用，别人不能调用
    override def setGender(gender: String): Unit = {
        this.gender = gender
    }

    // 自己能调用，别人不能调用
    override def setInterests(interests: String): Unit = {
        this.interests = interests
    }

    // 自己不能给自己评分，别人可以评分
    override def setScore(score: Int): Unit = {
        this.score = score
    }
}
