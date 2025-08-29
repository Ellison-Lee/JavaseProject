package com.lisheng.constructor;

public class Student {
    String name;
    int age;
    char sex;
    //1.无参数构造器
    //构造器：是一种特殊方法，不能写返回值的类型，名称必须是类名，就是构造器
    public Student(){
        System.out.println("=========无参数构造器执行了=======");
    }

    //2.有参数构造器
    public Student(String n,int a,char s){
        name = n;
        age = a;
        sex = s;
    }
}
