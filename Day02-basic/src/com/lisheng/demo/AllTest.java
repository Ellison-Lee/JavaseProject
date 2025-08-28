package com.lisheng.demo;

import java.util.Scanner;

/**
 * 开发一个健康计算器，可以接受用户输入的体重和身高，并计算BMI指数，BMR基础代谢率
 */
public class AllTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 获取用户输入的体重和身高
        System.out.println("请输入体重(kg)：");
        double weight = sc.nextDouble();
        System.out.println("请输入身高(m)：");
        double height = sc.nextDouble();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        // 2. 计算BMI指数
        double bmi = weight / (height * height);
        System.out.println("BMI指数为：" + bmi);
        // 3. 判断BMI指数的范围
        if (bmi < 18.5) {
            System.out.println("过轻");
        }
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("正常");
        }
        else if (bmi >= 25 && bmi < 28) {
            System.out.println("过重");
        }
        else if (bmi >= 28 && bmi < 30) {
            System.out.println("肥胖");
        }
        else {
            System.out.println(" severely obese");
        }
        // 4. 计算BMR基础代谢率
        double bmr= 0;
        System.out.println("请输入性别（1：男，2：女）：");
        int sex = sc.nextInt();
        if (sex == 1) {
            bmr = 88.362 + (13.397 * weight) + (4.799 * height*100) - (5.677 * age);
            System.out.println("BMR：" + bmr);
        }
        else if (sex == 2) {
            bmr = 447.593+(9.247 * weight + 3.098 * height - 4.330 * age);
            System.out.println("BMR：" + bmr);
        }

    }
}
