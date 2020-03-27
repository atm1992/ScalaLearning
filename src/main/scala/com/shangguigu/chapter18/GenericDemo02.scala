package com.shangguigu.chapter18

/**
 * Created by liuquan on 2020/3/26.
 */
object GenericDemo02 extends App {
    val class01 = new EnglishClass[SeasonEnum.SeasonEnum, String, String](SeasonEnum.spring, "315班", "高级班")
    println("class01的信息： " + class01.classSeason + " " + class01.className + " " + class01.classType)

    val class02 = new EnglishClass[SeasonEnum.Value, String, Int](SeasonEnum.autumn, "002班", 2)
    println("class02的信息： " + class02.classSeason + " " + class02.className + " " + class02.classType)
}

// 入参前面加上val，表示将该变量作为类的只读属性
class EnglishClass[A, B, C](val classSeason: A, val className: B, val classType: C)

// 开班季节是枚举类型
object SeasonEnum extends Enumeration {
    // 加上这句话，在泛型[]中可使用SeasonEnum.SeasonEnum 或 SeasonEnum.Value。注释掉这句话，则只能使用SeasonEnum.Value
    type SeasonEnum = Value         // 声明枚举对外暴露的变量类型，这里的Value是个抽象类
    val spring, autumn, summer, winter = Value      // 这里的Value是个无参方法。按变量名生成枚举名，并自动从0开始生成枚举ID
}