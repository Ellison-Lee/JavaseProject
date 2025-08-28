package com.lisheng.method;
/**
 * 目标：在无返回值的方法中单独使用return，提前结束方法
 */
public class MethodDemo3 {
    public static void main(String[] args){
        div(10,0);
    }
    public static void div(int a,int b){
        if(b==0){
            System.out.println("除数不能为0");
            return;
        }
        System.out.println(a/b);
    }
}

