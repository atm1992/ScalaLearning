package com.shangguigu.chapter01

/**
 * Created by liuquan on 2020/1/9.
 * 字符串的三种输出方式
 */
object printDemo {
    def main(args: Array[String]): Unit = {
        val str1: String = "hello"
        val str2: String = " world"
        println(str1 + str2)
        val name: String = "lq"
        val age: Int = 18
        val sal: Float = 28.5f
        val height: Double = 178.4
        //        格式化输出
        printf("名字=%s 年龄为%d 薪水为%.2f 身高为%.2f", name, age, sal, height)

        //        $输出。编译器会去解析$对应的变量，对执行效率没有影响
        println(s"个人信息：\n名字 $name \n年龄 $age \n薪水 $sal")
        println(s"个人信息：\n名字 ${name} \n年龄 ${age + 10} \n薪水 ${sal * 2}") // {}里面是一个表达式，可以进行运算
    }
}
