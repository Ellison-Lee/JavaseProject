package com.lisheng.polymorphsm1;

public class Wolf extends  Animal{
    String name = "wolf";
    @Override
    public void run()
    {
        System.out.println("Wolf is running");
    }
}
