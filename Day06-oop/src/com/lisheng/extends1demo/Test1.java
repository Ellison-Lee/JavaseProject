package com.lisheng.extends1demo;

public class Test1 {
    public static void main(String[] args) {
        //目标：认识继承的好处
        //1.创建对象，封装老师数据
        //子类可以继承父类非静态成员变量和成员方法
        Teacher t1 = new Teacher();
        t1.setName("lisheng");
        t1.setSex('男');
        t1.setSkill("java");
    }
}
