package com.lisheng.variable;
/**
 * 目标：熟悉变量写法
 */
public class VariableDemo {
    public static void main(String[] args) {
        //展示定义并赋值int long float double boolean char
        int a = 10;
        //随便写的一个整数字面量默认是int类型，所以即使赋值给long变量，也会报错，需加上L
        long b = 1000000000000000000L;
        float c = 10.1f;
        double f = 10.1;
        boolean d = true;
        char e = 'a';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
