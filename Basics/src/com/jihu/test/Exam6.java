package com.jihu.test;

/**
 * 最好单个单个分析
 *
 */
public class Exam6 {
    static int s;
    int i,j;
    {
        int i =1;
        this.i++; //对Exam5 i没有影响
        j++;
        s++;
    }

    public void test(int j){
        this.j++; //对Exam5 j没有影响
        i++;
        s++;
}

    public static void main(String[] args) {
        Exam6 obj1 = new Exam6(); // i = 1 j=1 s=1
        Exam6 obj2 = new Exam6(); // i = 1 j=1 s=2
        obj1.test(10); //i=2,j=2,s=3
        obj1.test(20); //i=3,j=3,s=4
        obj2.test(30); //i=2,j=2,s=5
        System.out.println(obj1.i+","+obj1.j +","+obj1.s);//3 3 5

        System.out.println(obj2.i+","+obj2.j +","+obj2.s);//2 2 5

    }
}
