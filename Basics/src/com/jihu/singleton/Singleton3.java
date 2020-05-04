package com.jihu.singleton;


public class Singleton3 {

    private static final Singleton3 INSTANCE ;

    static {
        INSTANCE = new Singleton3();
    }

    private Singleton3(){

    }

    public static Singleton3 getInstance(){
        return INSTANCE;
    }
}
