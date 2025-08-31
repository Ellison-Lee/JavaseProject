package com.lisheng.polymorphsm2;

public class Wolf extends Animal {
    String name = "wolf";
    @Override
    public void run()
    {
        System.out.println("Wolf is running");
    }

    public void eatSheep()
    {
        System.out.println("Wolf is eating a sheep");
    }
}
