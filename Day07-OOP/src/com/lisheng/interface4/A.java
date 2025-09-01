package com.lisheng.interface4;

public interface A {
    //1.默认方法，必须加default修饰
    //默认public修饰
    //使用接口的实现类的对象来调用
    default void go(){
        System.out.println("=====go方法执行了=====");
        run();
    }

    //2.私有方法（JDK 9开始支持）
    //私有的实例方法
    //使用接口中的其他实例方法来调用
    private void run(){
        System.out.println("=====run方法执行了=====");
    }

    //3.静态方法
    //默认public修饰
    //只能使用当前的接口名来调用
    static void show(){
        System.out.println("=====show方法执行了=====");
    }
}
