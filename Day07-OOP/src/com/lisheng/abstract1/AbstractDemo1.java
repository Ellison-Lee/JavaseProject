package com.lisheng.abstract1;

public class AbstractDemo1 {
    public static void main(String[] args) {
        //目标：认识抽象类，抽象方法
        //抽象类的核心特点：有得有失（的搭配抽象方法的能力，失去了创建对象的能力）
        //A a = new A();//报错
        B b = new B();
        b.setAge(18);
        System.out.println(b.getAge());
    }
}
