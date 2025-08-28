package com.lisheng.branch;

public class SwitchDemo3 {
    //目标：明白switch用法，推荐区间使用if，值匹配使用switch
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        //需求：根据性别推荐一款手机
        //让用户选择性别
        System.out.println("请输入性别：1-男 2-女");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int sex = sc.nextInt();
        switch(sex) {
            case 1:
                System.out.println("推荐华为手机");
                break;
            case 2:
                System.out.println("推荐苹果手机");
                break;
            default:
                System.out.println("请重新输入");
        }
    }
}
