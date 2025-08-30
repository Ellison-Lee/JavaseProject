package com.lisheng.staticfield;

public class Test {
    public static void main(String[] args) {
        //目标：认识static，特点访问机制
        //1.类名，静态变量
        Student.name = "lisheng";
        System.out.println(Student.name);

        //2.对象名，静态变量（不推荐）
        Student s1 = new Student();
        s1.name = "qiuya";

        Student s2 = new Student();
        s2.name = "madongmei";

        System.out.println(s1.name);
        System.out.println(Student.name);
    }
}
