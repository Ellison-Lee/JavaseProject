package com.lisheng.capsulation;

public class Student {
    String name;
    //1.如有问题，使用private 修饰符,只能在本类直接访问
    private int age;
    private double chinese;
    private double math;

    //2.合理暴露，使用public 修饰符的setAge方法
    public void setAge(int age){
        if (age>0 && age<=120){
            this.age = age;
        }else{
            System.out.println("年龄输入非法");
        }
    }

    //3.合理暴露，使用public 修饰符的getAge方法
    public int getAge(){
        return age;
    }
    public void printAllScore(){
        System.out.println(name+"的总成绩是"+(chinese+math));
    }
}
