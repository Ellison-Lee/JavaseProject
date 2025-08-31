package com.lisheng.demo;

public class SilverCard extends  Card{
    public SilverCard(String carID, String name, String phone, double money) {
        super(carID, name, phone, money);
    }
    @Override
    public void consume(double money) {
        System.out.println("您当前消费：" + money);
        System.out.println("优惠后价格" + money * 0.9);
        //检测余额是否足够
        if (getMoney() < money * 0.9) {
            System.out.println("余额不足");
            return;
        }
        //更新金额
        setMoney(getMoney() - money * 0.9);
        System.out.println("消费成功，当前余额为：" + getMoney());
    }
}
