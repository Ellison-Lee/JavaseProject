package com.lisheng.innerclass2;

public class InnerClassDemo2 {
    public static void main(String[] args) {
        //目标：清楚静态内部类的语法
        //创建对象：外部类名称.内部类名称 创建对象名 = new 外部类名称.内部类名称();
        Outer.Inner inner = new Outer.Inner();
        inner.show();
        //1.静态内部中可以直接访问外部类的静态成员
    }
}
