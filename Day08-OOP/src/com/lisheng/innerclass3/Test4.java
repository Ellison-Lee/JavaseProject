package com.lisheng.innerclass3;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        //目标：完成数组排序，理解其中匿名类的方法
        //准备中国学生类型数组
        Student[] students = new Student[6];
        students[0] = new Student("赵敏", 18, 1.75, '男');
        students[1] = new Student("小龙女", 19, 1.65, '女');
        students[2] = new Student("小昭", 17, 1.55, '女');
        students[3] = new Student("小儿", 12, 1.55, '女');
        students[4] = new Student("小三", 17, 1.55, '女');
        students[5] = new Student("小数", 14, 1.55, '女');

        //需求：按照年龄升序排序，可以调用写好的API
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //指定排序规则
                //如果认为左边对象大于右边对象，那么返回正数，反之亦然
                return o1.getAge() - o2.getAge();
            }
        });

        // 输出排序后的结果
        System.out.println("按年龄升序排序后的学生列表：");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
