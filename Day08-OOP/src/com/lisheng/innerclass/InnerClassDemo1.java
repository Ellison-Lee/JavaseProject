package com.lisheng.innerclass;

public class InnerClassDemo1 {
    public static void main(String[] args) {
        //目标：内部类
        //创建外部类对象:外部类名称.内部类名称 对象名 = 外部类对象.new 内部类名称();
        Outer.Inner oi = new Outer().new Inner();
    }
}
