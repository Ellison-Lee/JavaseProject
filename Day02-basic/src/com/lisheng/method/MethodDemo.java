package com.lisheng.method;
/**
 * 定义一个方法，求任意两个整数的和
 */
public class MethodDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = getSum(a,b);
        System.out.println(sum);
        print();
    }
    public static int getSum(int a,int b){
        int sum = a + b;
        return sum;
    }

    //打印3行诗句，不需要参数和返回值
    public static void print(){
        System.out.println("独上西楼月如钩");
        System.out.println("西风瘦马客输西风");
        System.out.println("西风瘦马客输西风");
    }
}