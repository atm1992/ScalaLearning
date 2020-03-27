package com.shangguigu.chapter08;

/**
 * Created by liuquan on 2020/3/7.
 */
public class JavaInnerClass {
    public static void main(String[] args) {
        // 创建外部类的对象
        OuterClass outer1 = new OuterClass();
        OuterClass outer2 = new OuterClass();

        // 创建成员内部类的对象
        // Java中将成员内部类看作是一个属性，因此使用outer1.new InnerClass()来创建内部类对象
        OuterClass.InnerClass inner1 = outer1.new InnerClass();
        OuterClass.InnerClass inner2 = outer2.new InnerClass();

        // Java的内部类只和类型有关，只要是OuterClass.InnerClass类型的对象就可以传给形参InnerClass ic
        // 内部类对象inner2是由外部类对象outer2所创建的，但却可以将其传入给内部类对象inner1的方法
        // inner1、inner2是由不同的外部类对象创建的，说明Java的内部类与外部类对象无关
        inner1.test(inner1);
        inner1.test(inner2);
        inner2.test(inner1);

        // 创建静态内部类的对象。因为静态内部类是和类相关的
        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
    }
}

class OuterClass {          // 外部类
    class InnerClass {      // 成员内部类
        public void test(InnerClass ic) {
            System.out.println(ic);
        }
    }

    static class StaticInnerClass {     // 静态内部类
    }
}
