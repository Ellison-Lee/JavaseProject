package com.lisheng.code;

public class CodeDemo2 {
    private String[] direction  = new String[4];
    //实例代码块：无static修饰，属于对象，每次创建对象时都会优先执行一次
    {
        System.out.println("===实例代码块===");
        direction[0] = "UP";
        direction[1] = "DOWN";
        direction[2] = "LEFT";
        direction[3] = "RIGHT";
    }
    public static void main(String[] args) {
        //目标：实例代码块
        System.out.println("===main方法===");
        new CodeDemo2();
        new CodeDemo2();
        new CodeDemo2();
    }
}
