package com.shangguigu.chapter10;

import java.util.HashSet;

/**
 * Created by liuquan on 2020/3/19.
 */
public class JavaHashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet<String>();
        hs.add("jack");
        hs.add("tom");
        hs.add("lily");
        System.out.println(hs);
    }
}
