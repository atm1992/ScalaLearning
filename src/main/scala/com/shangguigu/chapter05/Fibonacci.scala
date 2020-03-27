package com.shangguigu.chapter05

/**
 * Created by liuquan on 2020/3/2.
 * 请使用递归的方式，求出斐波那契数1,1,2,3,5,8,13...
 * 给你一个整数n，求出它的斐波那契数是多少？
 */
object Fibonacci {
    def main(args: Array[String]): Unit = {
        val n = 7
        printf("第 %d 个斐波那契数为：%d",n,fib(n))
    }
     def fib(n:Int): Int ={
         if(n==1 || n==2){
             return 1
         }else{
             fib(n-1)+fib(n-2)
         }
     }
}
