package com.lisheng.javabean;

public class StudentOperator {
    //拿到要处理的学生对象
    private Student s;//记住将来要操作的对象
    public StudentOperator(Student s){
        this.s = s;
    }

    //提供方法：打印学生总成绩
    public void printTotalScore(){
        System.out.println(s.getName() + "的总成绩是：" + (s.getChinese() + s.getMath()));
    }
    //提供方法：打印学生平均成绩
    public void printAverageScore(){
        System.out.println(s.getName() + "的平均成绩是：" + ((s.getChinese() + s.getMath())/2));
    }
}
