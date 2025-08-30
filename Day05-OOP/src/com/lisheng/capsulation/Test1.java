package com.lisheng.capsulation;

public class Test1 {
    public static void main(String[] args){
        //目标：清楚封装设计思想，合理隐藏，合理暴露
        Student s1 = new Student();
        s1.setAge(18);
        System.out.println(s1.getAge());
    }
}
