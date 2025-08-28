package com.lisheng.branch;

public class IfTest2 {
    public static void main(String[] args) {
        //目标：完成自动汽车驾驶程序，以便可以根据红绿灯状态选择正确形式
        test1();
    }

    public static void test1() {
        //红绿灯状态
        int light = 1;
        if(light == 1) {
            System.out.println("请左转");
        } else if(light == 2) {
            System.out.println("请右转");
        } else {
            System.out.println("请保持Straight");
        }
    }
}
