package com.lisheng.innerclass3;

public class Test {
    public static void main(String[] args) {
        //目标：认识匿名内部类
        //匿名内部类实际有名字：外部类名$编号.class
        //本质上是一个子类，并会立即创建出一个子类对象
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("汪汪汪");
            }
        };
        a.cry();
    }
}
