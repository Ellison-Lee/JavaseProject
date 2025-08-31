package com.lisheng.extends2modifier;

public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        //fu.printMethod();//报错
        fu.method();
        fu.protectedMethod2();
        fu.publicMethod();
    }
}
