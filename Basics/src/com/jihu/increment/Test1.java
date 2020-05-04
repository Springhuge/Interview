package com.jihu.increment;

/**
 * 如下代码运行结果
 */
public class Test1 {

    public static void main(String[] args) {
        int i = 1;
        i = i++; //i = 1
        int j = i++; //j = 1;i = 2
        int k = i+ ++i * i++; // k = 11 i= 4
        System.out.println("i="+i); // 4
        System.out.println("j=" + j); // 1
        System.out.println("k=" + k);//11
    }
}
