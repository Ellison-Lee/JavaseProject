package com.lisheng.staticmethod;

public class Student {
    private double score;
    //静态方法

    public static void print(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }

    //实例方法：没有static修饰，属于对象持有

    public void printPass(){
        System.out.println(score >= 60 ? "通过" : "未通过");
    }

    public void setScore(double score){
        this.score = score;
    }
}
