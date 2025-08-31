package com.lisheng.polymorphsm1;

public class Test {
    public static void main(String[] args){
        //目标：理解多态
        Animal a1  = new Wolf();//父类引用子类对象
        a1.run();//编译看左边，运行看右边
        System.out.println(a1.name);//编译看左边，运行也看左边
        System.out.println("----------");
        Animal a2  = new Tortosise();
        a2.run();
        System.out.println(a2.name);
    }
}
