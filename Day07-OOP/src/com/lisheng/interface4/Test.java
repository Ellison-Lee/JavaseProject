package com.lisheng.interface4;

public class Test {
    public static void main(String[] args) {
        //理解JDK 8之后的接口新增形式
        AImpl a = new AImpl();
        a.go();
        A.show();
    }

    static class AImpl implements A{

    }
}
