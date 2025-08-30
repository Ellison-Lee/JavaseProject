package com.lisheng.javabean;

public class Student {
    //1. 私有成员变量
    private String name;
    private double chinese;
    private double math;

    //提供无参构造器
    public Student(){

    }

    //提供一个有参构造器
    public Student(String name,double chinese,double math){
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    //2. 提供公开的getter,setter方法

    public String getName() {
        return name;
    }

    public double getChinese() {
        return chinese;
    }

    public double getMath() {
        return math;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public void setMath(double math) {
        this.math = math;
    }
}
