package com.lisheng.loop;

public class DowhileDemo1 {
    public static void main(String[] args) {
        test1();
    }

    public static void test1()
    {
        int i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while(i < 5);
    }
}
