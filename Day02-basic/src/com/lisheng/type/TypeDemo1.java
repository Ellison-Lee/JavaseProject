package com.lisheng.type;

public class TypeDemo1 {
    //目标：认识自动类型转化，强制类型转换
    public static void main(String[] args) {
        byte a = 10;
        print(a);
        print2(a);

        System.out.println("------------------");

        int i = 200;
        //print3(i);//类型范围大不能直接赋值非类型范围小的变量

        //强制类型转换
        print3((byte)i);
    }

    public static void print(int a){
        System.out.println(a);
    }

    public static void print2(long a){
        System.out.println(a);
    }

    public static void print3(byte a){
        System.out.println(a);
    }
}
