package com.shangguigu.chapter07;

/**
 * Created by liuquan on 2020/3/5.
 */
public class AnonymousSubClass {
    public static void main(String[] args) {
        A2 a2 = new A2() {
            public void cry() {
                System.out.println("cry ...");
            }
        };
        a2.cry();
    }
}

abstract class A2 {
    abstract public void cry();
}