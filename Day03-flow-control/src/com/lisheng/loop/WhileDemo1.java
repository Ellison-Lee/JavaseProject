package com.lisheng.loop;

public class WhileDemo1 {
    //认识while循环,通常知道循环次数使用for,不清楚循环次数使用while
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        int i = 0;
        while(i < 5) {
            System.out.println("i = " + i);
            i++;
        }
    }
}
