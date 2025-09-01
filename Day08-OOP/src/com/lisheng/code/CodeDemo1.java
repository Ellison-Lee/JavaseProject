package com.lisheng.code;

import java.util.Arrays;

public class CodeDemo1 {
    public static String schoolName;
    public static String[] cards = new String[54];
    //静态代码块，与类一起优先加载，自动执行一次
    //基本作用，可以完成对类的静态资源初始化
    static {
        System.out.println("===静态代码块===");
        schoolName = "黑马程序员";
        cards[0] = "大王";
        cards[1] = "小王";
    }
    public static void main(String[] args) {
        System.out.println("===main方法===");
        System.out.println(schoolName);
        System.out.println(Arrays.toString(cards));
    }
}
