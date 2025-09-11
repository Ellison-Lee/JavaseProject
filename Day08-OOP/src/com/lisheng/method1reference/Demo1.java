package com.lisheng.method1reference;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        //目标：静态方法引用，演示一个场景
        test();
    }

    public static void test() {
        Student[] students = new Student[7];
        //创建6个姓名，身高都不同的中国学生
        students[0] = new Student("小龙女", 18, 1.65, '女');
        students[1] = new Student("小昭", 19, 1.55, '女');
        students[2] = new Student("小三", 27, 1.55, '女');
        students[3] = new Student("张无忌", 12, 1.55, '女');
        students[4] = new Student("张明", 37, 1.55, '女');
        students[5] = new Student("张敏", 14, 1.55, '女');
        students[6] = new Student("李亦非", 18, 1.55, '女');

        //需求：按照年龄升序排序
        Arrays.sort(students, (Student o1, Student o2) ->o1.getAge()-o2.getAge());

        Arrays.sort(students,Student::compareByAge); // ->前后参数一致，可以使用静态方法引用

        //遍历数组输出
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
