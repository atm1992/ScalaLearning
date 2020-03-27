package com.shangguigu.chapter17.dynamicproxy

import java.lang.reflect.Proxy

/**
 * Created by liuquan on 2020/3/26.
 */
class MatchService {
    val tom = getPersonInfo("tom", "男", "爱好编程")
    // 得到一个给自己调用的代理对象，代替被调用的对象
    val ownerProxy = getOwnerProxy(tom)
    println("Name is " + ownerProxy.getName())
    println("Interests is " + ownerProxy.getInterests())
    ownerProxy.setInterests("爱好淘宝")
    println("Interests is " + ownerProxy.getInterests())
    ownerProxy.setScore(100) // 自己给自己设置评分，通过代理控制，不能设置成功
    println("Score is " + ownerProxy.getScore())

    println("-----------------测试NonOwnerInvocationHandler-----------------")

    val mary = getPersonInfo("mary", "女", "爱好购物")
    val nonOwnerProxy = getNonOwnerProxy(mary)
    println("Name is " + nonOwnerProxy.getName())
    println("Interests is " + nonOwnerProxy.getInterests())
    // 其他人不能修改兴趣，通过代理控制，不能设置成功
    nonOwnerProxy.setInterests("爱好看书")
    println("Interests is " + nonOwnerProxy.getInterests())
    nonOwnerProxy.setScore(80) // 其他人给自己设置评分
    println("Score is " + nonOwnerProxy.getScore())

    def getPersonInfo(name: String, gender: String, interests: String): PersonBean = {
        val person = new PersonBeanImpl
        person.setName(name)
        person.setGender(gender)
        person.setInterests(interests)
        person
    }

    def getOwnerProxy(person: PersonBean): PersonBean = {
        Proxy.newProxyInstance(person.getClass.getClassLoader, person.getClass.getInterfaces,
            new OwnerInvocationHandler(person)).asInstanceOf[PersonBean]
    }

    def getNonOwnerProxy(person: PersonBean): PersonBean = {
        Proxy.newProxyInstance(person.getClass.getClassLoader, person.getClass.getInterfaces,
            new NonOwnerInvocationHandler(person)).asInstanceOf[PersonBean]
    }
}
