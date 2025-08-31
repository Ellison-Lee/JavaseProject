package com.lisheng.demo;

public class GoldCard extends Card{

    public GoldCard(String carID, String name, String phone, double money) {
        super(carID, name, phone, money);
    }

    @Override
    public void consume(double money) {
        System.out.println("您当前消费："+money);
        System.out.println("优惠后价格"+money*0.8);
        //检测余额是否足够
        if(getMoney()<money*0.8){
            System.out.println("余额不足");
            return;
        }
        //更新金额
        setMoney(getMoney()-money*0.8);
        System.out.println("当前余额为："+getMoney());
        //判断消费是否大于200，调用独有功能
        if(getMoney()>200){
            System.out.println("恭喜您获得一张金卡洗车券");
        }else {
            System.out.println("当前消费不满200，无法打印洗车票");
        }
    }

    //打印洗车票
    public void printTicket(){
        System.out.println("恭喜您获得一张金卡洗车券");
    }
}
