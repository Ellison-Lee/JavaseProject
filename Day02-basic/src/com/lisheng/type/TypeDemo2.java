package com.lisheng.type;

public class TypeDemo2 {

    public static void main(String[] args) {
        //目标：理解表达式的自动类型提升
        int a = 10;
        int b = 20;
        double c = 30.0;
        double d = 40.0;
        System.out.println(calc(a,b,c,d));
        System.out.println("======================");
        byte e = 100;
        byte f = 100;
        System.out.println(calc(e,f));
        System.out.println(calc2(e,f));
    }

    //需求：接受各种类型的数据运算
    public static double calc(int a,int b,double c,double d){
        return a+b+c+d;
    }

    public static int calc(byte a,byte b){
        //此处使用返回类型使用int，因为byte,char,short是直接转换成int类型参与运算
        //填写byte会报错
        return a+b;
    }

    public static byte calc2(byte a,byte b){
        byte c = (byte)(a+b); //此方法运算结果会超出byte的范围，所以需要使用强制类型转换
        return c;
    }


}
