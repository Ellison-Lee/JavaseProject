package com.lisheng.loop;

public class DeadForDemo1 {
    public static void main(String[] args) {
        //目标掌握死循环
        test1();
        test2();
    }


    public static void test1() {
        for(;;) {
            System.out.println("hello world");
        }
    }

    public static void test2() {
        while(true) {
            System.out.println("hello world");
        }
    }

}
