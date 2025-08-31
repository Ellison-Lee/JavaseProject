package com.lisheng.feature;

public class Test {
    public static void main(String[] args) {
        //目标：继承的注意事项，特点
        A a = new A();
        B b = new B();
        C c = new C();
    }
}

    //1.Java的类只能单继承
    //2.一个类要么直接继承Object，要么默认继承Object
    class A{ }

    class B extends A{ }

    class C extends B{ }




