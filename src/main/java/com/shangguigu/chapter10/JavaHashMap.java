package com.shangguigu.chapter10;

import java.util.HashMap;

/**
 * Created by liuquan on 2020/3/18.
 */
public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap();
        hm.put("no1",100);
        hm.put("no2",200);
        hm.put("no3",300);

        System.out.println(hm);     // 无序的
        System.out.println(hm.get("no2"));
    }
}
