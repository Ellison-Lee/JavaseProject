package com.lisheng.interface1;
//接口
public interface A {
    //JDK 8之前，接口中只能定义常量和抽象方法
    //1.接口中定义常量可以省略public static final，默认有
    String SCHOOL_NAME = "上海大学";

    //2.抽象方法,可以省略public abstract
    void show();
}
