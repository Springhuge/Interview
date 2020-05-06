package com.jihu.step;

import org.junit.Test;

public class TestStep2 {

    public int loop(int n){
        if(n < 1){
            throw new RuntimeException(n+"不能小于1");
        }
        if(n == 1 || n==2){
            return n;
        }
        int one = 2;//走到第二级台阶的走法
        int two = 1;//走到第一级台阶的走法
        int sum  = 0;

        for(int i =3;i <= n; i++ ){
            //最后跨两部 + 最后跨一步的走法
            sum = two + one;
            two = one;
            one = sum;
        }
        return sum;
    }

    @Test
    public  void test() {
        long start = System.currentTimeMillis();
        System.out.println(loop(40)); //165580141
        long end = System.currentTimeMillis();
        System.out.println(end - start); //0
    }
}
