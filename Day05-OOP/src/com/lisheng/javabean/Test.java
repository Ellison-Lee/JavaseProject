package com.lisheng.javabean;

public class Test {
    //目标：清楚实体类及其应用场景
    //实体类的基本作用，创建对象，存取数据

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("lisheng");
        s1.setChinese(90);
        s1.setMath(80);
        System.out.println(s1.getName() + " " + s1.getChinese() + " " + s1.getMath());

        Student s2 = new Student("lisheng",90,80);
        System.out.println(s2.getName() + " " + s2.getChinese() + " " + s2.getMath());

        //实体类应用场景
        //创建一个学生操作对象专门对其进行业务处理
        StudentOperator so = new StudentOperator(s2);
        so.printTotalScore();
        so.printAverageScore();

    }
}
