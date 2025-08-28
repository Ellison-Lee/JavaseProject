package com.lisheng.loop;

public class ForForDemo1 {
    public static void main(String[] args) {
        //明白循环嵌套
        test1();
    }

    public static void test1() {
        //打印4行5列的*
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();//换行
        }
    }
}
