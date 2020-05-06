package com.jihu.test;

/**
 * 最好单个单个分析
 *
 */
public class Exam5 {
    static int s;
    int i,j;
    {
        int i =1;
        i++; //对Exam5 i没有影响
        j++;
        s++;
    }

    public void test(int j){
        j++; //对Exam5 j没有影响
        i++;
        s++;
}

    public static void main(String[] args) {
        Exam5 obj1 = new Exam5(); // i = 0 j=1 s=1
        Exam5 obj2 = new Exam5(); // i = 0 j=1 s=2
        obj1.test(10); //i=1,j=1,s=3
        obj1.test(20); //i=2,j=1,s=4
        obj2.test(30); //i=1,j=1,s=5
        System.out.println(obj1.i+","+obj1.j +","+obj1.s);//2 1 5

        System.out.println(obj2.i+","+obj2.j +","+obj2.s);//1 1 5

    }
}
