package com.lisheng.branch;

public class SwitchDemo4 {
    public static void main(String[] args) {
        //明白switch穿透性应用
        test1();
        test2();
    }

    public static void test1() {
        int a = 1;
        //case给出的只能是字面量，不能是变量
        switch (a) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            default:
                System.out.println("没有匹配的");
        }
    }

    public static void test2() {
        //不写break，则有穿透性
        System.out.println("请输入星期：1-7");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int week = sc.nextInt();
        switch(week) {
            case 1:
            case 7:
                System.out.println("帮助周日");
                break;
            case 2:
                System.out.println("帮助周一");
                break;
            case 3:
                System.out.println("帮助周二");
                break;
            case 4:
                System.out.println("帮助周三");
                break;
            case 5:
                System.out.println("帮助周四");
                break;
            case 6:
                System.out.println("帮助周五");
                break;
            default:
                System.out.println("没有匹配的");
        }
    }
}
