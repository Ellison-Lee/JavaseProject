package com.lisheng.object;
//学生类
public class Student {
    String name;
    double chinese;
    double math;

    public void printAllScore(){
        System.out.println(name+"总成绩是："+(chinese+math));
    }

    public void printAvgScore(){
        System.out.println(name+"平均成绩是："+(chinese+math)/2);
    }
}
