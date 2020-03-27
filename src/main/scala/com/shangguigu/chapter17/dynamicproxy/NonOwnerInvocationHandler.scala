package com.shangguigu.chapter17.dynamicproxy

import java.lang.reflect.{InvocationHandler, Method}

/**
 * Created by liuquan on 2020/3/26.
 */
// 其它用户调用的代理
class NonOwnerInvocationHandler extends InvocationHandler {
    // 被调用的对象。可理解为PersonBeanImpl，使用父类的引用可以接受更多种类
    var person: PersonBean = _

    def this(person: PersonBean) = {
        this
        this.person = person
    }

    // 这里的Proxy就是和NonOwnerInvocationHandler合作的代理
    @throws(classOf[Throwable])
    override def invoke(proxy: Any, method: Method, args: Array[AnyRef]): AnyRef = {
        // 如果是get方法，则直接调用
        if (method.getName.startsWith("get")) {
            return method.invoke(person)
            // 其它用户可以调用setScore方法进行评分
        } else if (method.getName.equals("setScore")) {
            return method.invoke(person, Integer.valueOf(args(0).toString))
            // 其它用户不能调用其余的set方法
        } else if (method.getName.startsWith("set")) {
            return new IllegalAccessException() // 返回一个异常，使用@throws抛给上一级了
        }
        null
    }
}
