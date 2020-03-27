package com.shangguigu.chapter07;

/**
 * Created by liuquan on 2020/3/5.
 */
public class JavaDynamicBind {
    public static void main(String[] args) {
        // 将一个子类的对象地址，赋给一个父类的引用
        A obj = new B();
        System.out.println(obj.sum1());     // ?
        System.out.println(obj.sum2());     // ?
    }
}

class A {
    public int i = 10;

    public int sum1() {
        return get1() + 10;
    }

    public int sum2() {
        return i + 10;
    }

    public int get1() {
        return i;
    }
}

class B extends A {
    public int i = 20;

//    public int sum1() {
//        return get1() + 20;
//    }

//    public int sum2() {
//        return i + 10;
//    }

//    public int get1() {
//        return i;
//    }
}