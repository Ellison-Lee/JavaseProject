package com.lisheng.demo;

public class Test1 {
    //目标：建议计算器开发
    public static void main(String[] args) {
        //1.键盘输入两个数，以及运算符
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入第一个数字：");
        double a = sc.nextDouble();
        System.out.println("请输入第二个数字：");
        double b = sc.nextDouble();
        System.out.println("请输入运算符：");
        char op = sc.next().charAt(0);
        double result = calc(a,b,op);
        System.out.println("结果是：" + result);
    }

    public static double calc(double a,double b,char op) {
        double result = 0;
        switch(op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("运算符输入错误！");
        }
        return result;
    }
}
