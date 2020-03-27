package com.shangguigu.chapter10;

import java.util.ArrayList;

/**
 * Created by liuquan on 2020/3/14.
 */
public class JavaCollection {
    public static void main(String[] args) {
        // 不可变集合
        int[] nums = new int[3];
        nums[2] = 15;
        nums[2] = 55;
//        nums[3] = 41;   // 报错数组索引越界异常。因为已经指定了数组的长度为3，因此索引最多为2
        String[] names = {"bj", "sh"};
        System.out.println(nums + " " + names);

        // 可变集合
        ArrayList<String> al = new ArrayList<>();
        al.add("zs");
        al.add("zs2");
        System.out.println(al + " 地址= " + al.hashCode());
        al.add("zs3");
        System.out.println(al + " 地址2= " + al.hashCode());
    }
}
