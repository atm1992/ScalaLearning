package com.shangguigu.chapter07;

/**
 * Created by liuquan on 2020/3/5.
 */
public class JavaFiledOverride {
    public static void main(String[] args) {
        Sub s1 = new Sub();
        System.out.println(s1.s);       // sub
        System.out.println(((Super) s1).s);       // super 。这里使用的强制转换
        Super s2 = new Sub();
        System.out.println(s2.s);       // super
    }
}

class Super {
    String s = "super";
}

class Sub extends Super {
    String s = "sub";
}
