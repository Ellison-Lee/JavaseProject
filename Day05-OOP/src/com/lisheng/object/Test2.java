package com.lisheng.object;

public class Test2 {
    public static void main(String[] args){
        //目标：创建学生对象储存学生数据
        Student s1 = new Student();
        s1.name = "lisheng";
        s1.chinese = 90;
        s1.math = 80;
        s1.printAllScore();
        s1.printAvgScore();
    }
}
