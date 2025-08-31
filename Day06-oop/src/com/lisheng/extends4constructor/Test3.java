package com.lisheng.extends4constructor;

public class Test3 {
    public static void main(String[] args) {
        //目标：；理解this(...)调用兄弟构造器
        //储存一个学生的数据
        Student s1 = new Student("lisheng",'男',25,"香港中文大学");
        Student s2 = new Student("赵敏",'女',18);
    }
}
