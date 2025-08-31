package com.lisheng.polymorphsm2;

public class Test {
    public static void main(String[] args){
        //认识多态的好处
        //1.右边对象是解耦合的
        Animal a = new Tortosise();//右侧可以改变，而不影响下列代码
        a.run();
        //a1.headShrink();不能调用子类独有功能

        System.out.println("----------");

        Wolf w = new Wolf();
        go(w);

        Tortosise t = new Tortosise();
        go(t);
    }

    //宠物游戏：所有动物都已送给这个方法开始跑步
    public static void go(Animal a){
        a.run();
    }
}
