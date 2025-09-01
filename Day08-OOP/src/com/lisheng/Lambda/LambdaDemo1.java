package com.lisheng.Lambda;


public class LambdaDemo1 {
    public static void main(String[] args) {
        //目标：认识Lambda表达式

        Animal a = new Animal(){
            @Override
            public void eat() {
                System.out.println("吃吃吃");
            }
        };
        a.eat();

        System.out.println("==================");

        //Lambda函数之恶能简化函数式接口的匿名内部类
        Swim s = ()-> {
            System.out.println("正在游泳");
        };
        s.swimming();

    }
}

abstract class Animal{
    public abstract void eat();
}

@FunctionalInterface //声明函数式接口的注解
interface Swim{
    void swimming();
}