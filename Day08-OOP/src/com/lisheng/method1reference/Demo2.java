package com.lisheng.method1reference;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        //目标：实例方法引用
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

        //需求：按照身高排序
        Student t = new Student();
        //Arrays.sort(students,(o1,  o2)->t.compareByHeight(o1,o2));

        Arrays.sort(students,t::compareByHeight);

        //遍历数组输出
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
