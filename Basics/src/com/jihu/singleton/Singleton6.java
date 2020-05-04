package com.jihu.singleton;

/**
 * 在内部类加载和初始化时，才创建INSTANCE实例对象
 * 静态内部类不会自动随着外部类的加载和初始化，它时要单独去加载和初始化的
 * 因为时在内部类加载和初始化，因此是*线程安全的
 */
public class Singleton6 {

    private Singleton6(){

    }

    private static class Inner{
        private static  Singleton6 instance = new Singleton6();
    }

    public static Singleton6 getInstance(){
        return Inner.instance;
    }
}
