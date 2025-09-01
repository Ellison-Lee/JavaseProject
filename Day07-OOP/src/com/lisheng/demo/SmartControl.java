package com.lisheng.demo;

public class SmartControl {
    private static final SmartControl smartControl = new SmartControl();
    private SmartControl(){}

    public static SmartControl getInstance(){
        return smartControl;
    }
    //多态
    public void control(JD jd){
        System.out.println(jd.getName()+"目前状态是："+(jd.isStatus()?"开":"关"));
        System.out.println("开始操作");
        jd.press();
        System.out.println(jd.getName()+"目前状态是："+(jd.isStatus()?"开":"关"));
    }

    public void printAllStatus(JD[] jds){
        for(int i = 0; i < jds.length; i++){
            System.out.println((i+1)+"."+jds[i].getName()+"目前状态是："+(jds[i].isStatus()?"开":"关"));
        }
    }
}
