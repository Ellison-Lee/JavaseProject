package com.lisheng.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        //目标：掌握创建字符串对象，封装要处理的字符串数据，调用方法，获取结果
        //1.直接使用“”就可以创建字符串对象
        String s1 = new String("hello world");
        System.out.println(s1.toString());
        System.out.println(s1.length());

        //2.使用构造器
        String s2 = new String();
        System.out.println(s2);

        String s3 = new String("hello world");
        System.out.println(s3);

        char[] chars = {'h','e','l','l','o'};
        String s4 = new String(chars);

        byte[] bytes = {97,98,99,100,101};
        String s5 = new String(bytes);

        String t1 = "abc";
        String t2 = "abc";
        System.out.println(t1 == t2);
        String t3 = new String("abc");
        String t4 = new String("abc");
        System.out.println(t3 == t4);

        //字符串内容的比较不要使用==，因为==比较的是地址
        System.out.println(t3.equals(t4));

        System.out.println("===============================");
        //13823229828==>139**********898
        System.out.println("请使用手机号登录：");
        Scanner sc = new Scanner(System.in);
        String phone = sc.next();

        System.out.println("系统显示以下手机号码进入：");
        //使用subString
        System.out.println(phone.substring(0,3) + "****" + phone.substring(7));
    }
}
