package com.jihu.methodparam;

import java.util.Arrays;

public class Exam4 {

    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num = 200;
        int[] arr = {1,2,3,4,5};
        Mydata my = new Mydata();

        change(i,str,num,arr,my);
        System.out.println("i = " + i); // 1
        System.out.println("str = " + str); // hello
        System.out.println("num = " + num); // 200
        System.out.println("arr = "+ Arrays.toString(arr)); // 2,2,3,4,5
        System.out.println("my.a =" + my.a);// 11

        /**
         * i = 1
         * str = hello
         * num = 200
         * arr = [2, 2, 3, 4, 5]
         * my.a =11
         */

    }

    public static void change(int j,String s,Integer n,int[] a,Mydata m){
        j += 1;
        s += "world";
        n += 1;
        a[0] += 1;
        m.a += 1;
    }
}

class Mydata{
    int a = 10;
}