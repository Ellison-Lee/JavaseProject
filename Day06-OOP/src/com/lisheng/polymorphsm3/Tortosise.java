package com.lisheng.polymorphsm3;

public class Tortosise extends Animal {
    String name = "乌龟";
    @Override
    public void run()
    {
        System.out.println("乌龟跑得慢");
    }

    //乌龟缩头
    public void shrinkHead(){
        System.out.println("乌龟缩头");
    }
}
