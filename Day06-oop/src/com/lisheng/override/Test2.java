package com.lisheng.override;

public class Test2 {
    public static void main(String[] args) {
        //目标：方法重写的应用场景：子类重写object的toString方法
        Student s1 = new Student("赵敏",'女',25);
        System.out.println(s1.toString());//com.lisheng.override.Student@b4c966a 地址
        //注意1：直接输出对象，默认使用toString方法,输出地址
        //注意2：输出对象的地址，实际上无意义，实际开发中更希望看对象内容信息
        //因此：子类重写toString方法，由于就近原则，会调用子类的toString方法
    }
}

class Student{
    private String name;
    private char sex;
    private int age;

    public Student(){}

    public Student(String name,char sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
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
}
