package com.lisheng.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：加油站支付小程序
        //1.创建卡片类，以便创建金卡或者银卡对象，封装车主数据
        //2.定义卡片父类
        //3.定义金卡子类,重写消费金额（8折）
        //4.办金卡，创建金卡对象，交给一个独立业务来完成
        System.out.println("欢迎办金卡");
        GoldCard gc = new GoldCard("粤A8888","lisheng","13025468523",2000);
        pay(gc);
        System.out.println("=============");
        //5.办银卡，创建银卡对象，交给一个独立业务来完成
        System.out.println("欢迎办银卡");
        SilverCard sc = new SilverCard("粤A10000","dilei","13028468523",2000);
        pay(sc);

    }

    //支付机
    public static void pay(Card c){
        System.out.println("欢迎使用加油服务");
        System.out.println("请输入消费金额");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);
    }
}
