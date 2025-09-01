package com.lisheng.interface2;

public class Test {
    public static void main(String[] args) {
        //目标：理解设计接口的好处
        //People p = new Student();
        //Driver d = new Student();
        //Boyfriend bf = new Student();

        //接口可以实现面向接口编程，利于解耦合
    }

    interface Driver{}
    interface Boyfriend{}

    class People{}
    class Student extends People implements Driver,Boyfriend{}

    class Teacher implements Driver,Boyfriend{}
}
