package com.shangguigu.chapter17.rmi

import java.rmi.registry.LocateRegistry
import java.rmi.{Naming, RemoteException}
import java.rmi.server.UnicastRemoteObject

/**
 * Created by liuquan on 2020/3/26.
 */
// 这里实现了MyRemote接口
class MyRemoteImpl extends UnicastRemoteObject with MyRemote {
    @throws(classOf[RemoteException])
    override def sayHello(): String = "hello world"
}

// 完成对服务中的sayHello方法的注册，将rmi地址与Naming进行绑定，使用Naming对服务进行管理
object MyRemoteImpl {
    def main(args: Array[String]): Unit = {
        val service: MyRemote = new MyRemoteImpl()
        // 第一种注册方式。将服务绑定到9999端口
//         Naming.rebind("rmi://127.0.0.1:9999/RemoteHello", service)

        // 第二种注册方式。将服务绑定到9999端口
//        LocateRegistry.createRegistry(9999)
//        Naming.rebind("RemoteHello", service)

        println("远程服务开启，在127.0.0.1的9999端口监听，服务名为RemoteHello")
    }
}
