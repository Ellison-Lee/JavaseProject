package com.lisheng.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：面向对象编程实现智能家居控制系统
        //角色：设备（吊灯，电视机，洗衣机，落地窗，....)
        //功能：开关
        //智能控制系统（单例对象），控制调用设备的开和关
        //1.定义设备类：创建设备对象代表家里的设备
        //2.准备这些设备对象，放到数组，代表整个家庭的设备
        JD[] jds = new JD[4];
        jds[0] = new WashMachine("美的",false);
        jds[1] = new TV("海信",false);
        jds[2] = new Lamp("LED灯",false);
        jds[3] = new AC("美的",false);

        //3.为每个设备指定开和关的功能，定义一个接口，让JD实现其功能
        //4.创建智能控制的对象，控制设备开关
        SmartControl smartControl = SmartControl.getInstance();
        //5.处理电视机
        //smartControl.control(jds[1]);
        //6.提示用户操作，a.展示全部设备当前情况 b.选择设备进行操作
        while (true) {
            smartControl.printAllStatus(jds);
            System.out.println("请选择设备进行操作：");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1":
                    smartControl.control(jds[0]);
                    break;
                case "2":
                    smartControl.control(jds[1]);
                    break;
                case "3":
                    smartControl.control(jds[2]);
                    break;
                case "4":
                    smartControl.control(jds[3]);
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("输入错误！");
            }
        }
    }
}
