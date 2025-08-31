package com.lisheng.override;

public class Test1 {
    public static void main(String[] args) {
        //目标：认识方法重写
        Cat c1 = new Cat();
        c1.eat();
    }
}

class Cat extends Animal{
    //重写
    @Override
    //告诉编译器，这个方法重写父类的方法,要求方法名称和参数必须和父类相同
    //更加安全、优雅
    //访问权限必须提升或者不变
    //重写的方法返回值类型必须和父类一致或者范围更小
    //私有、静态方法不能被重写
    public void eat(){
        System.out.println("小口吃");
    }
}

class Animal{
    public void eat(){
        System.out.println("吃吃吃");
    }
}
