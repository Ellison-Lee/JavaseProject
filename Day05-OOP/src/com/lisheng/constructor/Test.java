package com.lisheng.constructor;

public class Test {
    public static void main(String[] args) {
        /*目标：认识类的构造器，清楚其特点与常见应用场景
        构造器特点：创建对象时，对象会立即自动给调用构造器
        类默认就自带一个无参构造器
        如果类定义了有参数构造器，类默认的无参数构造器就没有了，需要自己定义无参数构造器
        */

        Student t1 = new Student();
        t1.name = "lisheng";
        t1.age = 18;
        t1.sex = '男';
        System.out.println(t1.name + " " + t1.age + " " + t1.sex);

        //对象的一种常见应用场景，创建对象时可以立即为对象赋值
        Student s2 = new Student("zhaangsan",18,'男');
        System.out.println(s2.name + " " + s2.age + " " + s2.sex);
    }
}
