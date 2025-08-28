package com.lisheng.branch;

/**
 * 认识if结构
 */
public class IfDemo1 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        int a = 10;
        if(a > 5) {
            System.out.println("a大于5");
        }
    }

    public static void test2() {
        int a = 10;
        if(a > 5) {
            System.out.println("a大于5");
        } else {
            System.out.println("a小于等于5");
        }
    }

    public static void test3() {
        int a = 10;
        if(a > 5) {
            System.out.println("a大于5");
        } else if(a > 3) {
            System.out.println("a大于3");
        } else {
            System.out.println("a小于等于3");
        }
    }
}
