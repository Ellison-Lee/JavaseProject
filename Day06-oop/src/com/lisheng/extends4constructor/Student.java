package com.lisheng.extends4constructor;

public class Student {
    private String name;
    private char sex;
    private int age;
    private String schoolName;

    public Student(){}

    public Student(String name,char sex,int age,String schoolName){
    	this.name = name;
    	this.sex = sex;
    	this.age = age;
    	this.schoolName = schoolName;
    }

    public Student(String name,char sex,int age){
        //this调用兄弟构造器
        //注意：super（）this（）必须在构造器第一行，且不能同时出现
        this(name,sex,age,"上海大学");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
