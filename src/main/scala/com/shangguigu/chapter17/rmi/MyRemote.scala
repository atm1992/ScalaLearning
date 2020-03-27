package com.shangguigu.chapter17.rmi

import java.rmi.{Remote, RemoteException}

/**
 * Created by liuquan on 2020/3/26.
 */
// 这是一个接口文件，该文件会给服务端和客户端共同使用
trait MyRemote extends Remote {
    // 必须要抛出一个异常，否则程序无法运行
    @throws(classOf[RemoteException])
    def sayHello(): String      // throw RemoteException
}
