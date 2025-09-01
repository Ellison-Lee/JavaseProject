package com.lisheng.abstract1;

import lombok.Data;

@Data
public abstract class A {
    private String name;
    private int age;

    public A(){
        System.out.println("无参构造方法");
    }

    public A(String name, int age){
        System.out.println("有参构造方法");
        this.name = name;
        this.age = age;
    }
    //抽象方法，没有方法体
    public abstract void show();

    public void show2(){
        System.out.println("普通方法");
    }
}
