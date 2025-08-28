package com.lisheng.method;
/**
 * 认识方法重载，方法名称相同，形参列表不同
 */
public class MethodDemo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = getSum(a,b);
        System.out.println(sum);

        double c = 10.0;
        double d = 20.0;
        double sum2 = getSum(c,d);
        System.out.println(sum2);
    }
    public static int getSum(int a,int b){
        return a+b;
    }
    public static double getSum(double a,double b){
        return a+b;
    }
}


