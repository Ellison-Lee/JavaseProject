package com.lisheng.operator;
/**
 * 理解关系运算符，逻辑运算符，三元运算符
 */
public class OperatorDemo4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println("=================");
        System.out.println(a > b && a < c);
        System.out.println(a > b || a < c);
        System.out.println(!(a > b));
        System.out.println(a > b ^ a < c);
        System.out.println(a > b ? a : b); //20
        System.out.println(a < b ? a : b); //10
    }

}
