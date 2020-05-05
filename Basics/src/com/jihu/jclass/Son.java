package com.jihu.jclass;

/**
 * 子类的初始化
 * 先初始化父类
 * 初始化子类
 * 1.j = method() 10
 * 2.子类的静态代码块 6
 *
 */
public class Son extends Father{

    private int i = test();

    private static int j = method();

    static {
        System.out.print("(6)");
    }

    Son(){
        System.out.print("(7)");
    }
    {
        System.out.print("(8)");
    }

    @Override
    public int test() {
        System.out.print("(9)");
        return 1;
    }


    public static int method(){
        System.out.print("(10)");
        return 1;
    }

    /**
     *
     *(5)(1)(10)(6)(9)(3)(2)(9)(8)(7)
     *(9)(3)(2)(9)(8)(7)
     * @param args
     */
    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println();
        Son s2 = new Son();
    }
}
