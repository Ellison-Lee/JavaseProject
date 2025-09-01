package com.lisheng.interface1;

public class Test {
    public static void main(String[] args) {
        //认识接口
    }

    class C implements A,B{

        @Override
        public void show() {
            System.out.println("show");
        }

        @Override
        public void play() {
            System.out.println("play");
        }
    }
}
