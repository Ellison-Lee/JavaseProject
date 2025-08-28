package com.lisheng.operator;

public class Operator2 {
    //目标：理解自增自减符号
    public static void main(String[] args) {
        print(10);
    }

    public static void print(int a) {
        System.out.println(a++); //先输出a，再自增1
        System.out.println(++a); //先自增1，再输出a
        System.out.println(a--);
        System.out.println(--a);
    }
}

