package com.lisheng.singleinstance;

public class A {
    //2.定义一个静态变量，用于本类的唯一一个对象
    private static  A a = new A();

    //1.私有化构造器
    private A(){}

    //3.定义一个静态方法，返回唯一一个对象
    public static A getInstance(){
        return a;
    }

}
