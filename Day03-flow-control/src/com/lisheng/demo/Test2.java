package com.lisheng.demo;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //目标：拆随机数
        guess();
    }

    public static void guess()
    {
        int number = (int)(Math.random()*100+1); //1-100的随机数
        while(true)
        {
            System.out.println("请输入一个数字：");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if(input > number)
                System.out.println("猜大了");
                else if(input < number)
                    System.out.println("猜小了");
                else
                    System.out.println("猜对了");
        }
    }
}
