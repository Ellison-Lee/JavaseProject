package com.lisheng;
/**
 * 目标：掌握常见字面量书写格式
 */

public class LiteralDemo {
    public static void main(String[] args) {
        // 数字字面量
        int a = 10;
        int b = 0x10;
        int c = 012;
        int d = 0b1010;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // 字符串字面量
        String name = "lisheng";
        System.out.println(name);

        // 字符字面量
        char ch = 'a';
        System.out.println(ch);

        // 布尔字面量
        boolean flag = true;
        System.out.println(flag);

        // 运算符
        int e= 10;
        int f = 20;
        System.out.println(e + f);
        System.out.println(e - f);
        System.out.println(e * f);

        //特殊字符
        System.out.println("Hello\nWorld");
        System.out.println("Hello\tWorld");

    }
}