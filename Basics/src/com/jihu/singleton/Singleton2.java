package com.jihu.singleton;

/**
 * 枚举类型 表示该类型的对象是有限的几个
 * 我们可以限定为一个，就成了单例
 *
 */
public enum Singleton2 {

    INSTANCE;

    public static Singleton2 getInstance(){
        return INSTANCE;
    }


    public static void main(String[] args) {
        Singleton2 singleton2  = Singleton2.getInstance();
        Singleton2 singleton2_1  = Singleton2.getInstance();
        System.out.println(singleton2);
        System.out.println(singleton2_1);
    }
}
