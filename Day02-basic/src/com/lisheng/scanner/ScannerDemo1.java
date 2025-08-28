package com.lisheng.scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //需求：键盘输入用户名和年龄，然后打印
        //创建Scanner扫描器对象
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next(); //让程序暂停，直到键盘输入一个字符串，并回车
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("用户名："+name+"，年龄："+age);
        sc.close();
    }
}
