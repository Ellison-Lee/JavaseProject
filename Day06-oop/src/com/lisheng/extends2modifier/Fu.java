package com.lisheng.extends2modifier;

public class Fu {
    //1.private,只能当前类中访问
    private void privateMethod()
    {
        System.out.println("privateMethod");
    }

    //2.default,当前包中访问
    void method()
    {
        System.out.println("void method");
    }


    //3.protected,当前包及子类中访问
    protected void protectedMethod2()
    {
        System.out.println("protected void protectedMethod");
    }


    //4.public,任何地方访问
    public void publicMethod()
    {
        System.out.println("public void publicMethod");
    }

    public static void main(String[] args){
        Fu fu = new Fu();
        fu.privateMethod();
        fu.method();
        fu.protectedMethod2();
        fu.publicMethod();
    }
}
