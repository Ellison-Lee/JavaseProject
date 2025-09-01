package com.lisheng.enumdemo;

public class Test {
    public static void main(String[] args){
        //目标认识枚举类
        A a1 = A.X;
        System.out.println(a1);

        A a2 = A.Y;
        System.out.println(a2);

        A a3 = A.Z;
        System.out.println(a3);

        System.out.println("==================");
        System.out.println(a1.name());
        System.out.println(a2.name());
        System.out.println(a1.ordinal());//索引 0
        System.out.println(a2.ordinal());//索引 1
    }
}
