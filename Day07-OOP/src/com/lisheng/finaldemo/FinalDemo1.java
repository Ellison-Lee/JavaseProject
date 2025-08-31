package com.lisheng.finaldemo;

public class FinalDemo1 {
    //final修饰静态变量，表示该变量不能被修改，通常作为系统配置信息
    //常量名称，建议全部大写，多个单词用下划线连接
    public static final String SCHOOL_NAME = "黑马程序员";

    //final修饰实例变量（一般没有意义）
    public final String name = "lisheng";

    public static void main(String[] args) {
        //目标：认识 final
        //3.final修饰变量，表示该变量仅能赋一次值
        /*
        变量分为
        a.成员变量:
           静态成员变量
           实例成员变量
        b.局部变量
         */
        final int age = 18;
        //age = 19;//报错

        //final修饰引用变量，其地址不可变，但是所指向的对象可以被修改
        final int[] arr = {1,2,3};
        arr[2] = 9;
    }

    public static void buy(final double z){
        //z = 20;//报错
        System.out.println(z);
    }
}

//1.final修饰类，表示该类不能被继承
final class A {}
//class B extends A {} //报错

//2.final修饰方法，表示该方法不能被重写
class C {
    final public void show() {
        System.out.println("A show()");
    }
}

//class B extends A {} //报错


