package com.lisheng.array;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //掌握数组的另一种写法，动态初始化数组
        inputScore();
    }

    public static void inputScore()
    {
        int[] score = new int[5]; //只确定数组的类型和容量，不放入具体数据
        //输入成绩
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第" + (i+1) + "个学生的成绩：");
            Scanner sc = new Scanner(System.in);
            score[i] = sc.nextInt();
        }

        //遍历数组，统计最高分，最低分，平均分
        int max = score[0];
        int min = score[0];
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
            sum += score[i];
        }
        System.out.println("最高分是：" + max);
        System.out.println("最低分是：" + min);
        System.out.println("平均分是：" + sum/score.length);
    }
}
