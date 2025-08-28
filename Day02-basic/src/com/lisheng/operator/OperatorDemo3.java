package com.lisheng.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //目标：掌握扩展赋值运算符
        receieve(10);
    }

    public static void receieve(int b)
    {
        int a = 100;
        a += b; // a = (a的类型)a + b;
        System.out.println("收到红包后的金额"+a);

        byte a1 = 10;
        int a2 = 200;
        a1 += a2; // a1 = (byte)(a1 + a2);
        System.out.println(a1);
    }
}
