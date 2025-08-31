package com.lisheng.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombook可以实现为类自动添加getter和setter方法等
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Card {
    private String carID;
    private String name;
    private String phone;
    private  double money;

    //预存金额

    public void deposit(double money){
        this.money += money;
    }

    //消费金额
    public void consume(double money){
        this.money -= money;
    }
}
