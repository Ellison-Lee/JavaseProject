package com.lisheng.staticmethod;

public class Test4 {
    //静态变量
    public static int count = 100;

    //静态方法
    public static void printHellloWorld2(){
        System.out.println("hello world");
        System.out.println("hello world");
    }

    //实例变量
    private String name;
    //实例方法
    public void run(){
        System.out.println("run");
    }

    public static void main(String[] args){
        //目标：清楚静态方法，实例方法访问的几点注意事项
    }

    //1.静态方法可以直接访问静态成员，不可以直接访问实例成员
    public static void printHelloWorld(){
        System.out.println(count);
        printHellloWorld2();
        //System.out.println(name);//报错
        //run();//报错
    }

    //2.实例方法可以访问静态成员，也可以访问实例成员
    public void print(){
        System.out.println(count);
        printHellloWorld2();
        System.out.println(name);
        run();
    }

    //实例方法可以出现this，静态方法不可以出现this
    public void printThis(){
        System.out.println(this);
    }
}
