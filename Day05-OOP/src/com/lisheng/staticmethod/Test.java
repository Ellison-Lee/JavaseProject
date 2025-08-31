package com.lisheng.staticmethod;

public class Test {
    public static void main(String[] args){
        //目标：认识static修饰和不修饰方法的区别
        //1.类名.静态方法（推荐）
        Student.print();

        System.out.println("------------------");

        //2.对象.静态方法（不推荐）
        Student s = new Student();
        s.print();

        //3.对象名.实例方法
        s.setScore(80);
        s.printPass();

        //规范：如果这个方法做一个功能不需要直接访问对象数据，这个方法直接定义成静态方法
        //     如果这个方法是对象的行为，需要访问这个对象的数据，这个方法必须定义成实例方法
    }
}
