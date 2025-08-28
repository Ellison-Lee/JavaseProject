package com.lisheng.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //目标：实现基础算术运算符
        print(10,3);
        System.out.println("======================");
        print2();
    }

    public static void print(int a,int b)
    {
        System.out.println("a+b="+(a+b)); //+符号与字符串运算时作为连接符
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(1.0*a/b));
        System.out.println("a%b="+(a%b));
    }

    //需求：研究+符号作为连接符还是运算
    public static void print2() {
        int a = 10;
        System.out.println("abc"+a);
        System.out.println(a+5);
        System.out.println("def"+a+"abc");
        System.out.println(a+'5'+"abc");
        System.out.println(1 + 2 + "3" + 4 + 5); // 3345
    }
}
