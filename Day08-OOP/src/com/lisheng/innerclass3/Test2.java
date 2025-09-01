package com.lisheng.innerclass3;

public class Test2 {
    public static void main(String[] args){
    //目标：清楚匿名内部类的使用实行
    //需求：学生，老师都要参加有用比赛
        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师仰泳");
            }
        };
        swiming(s1);
        Swim s2 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生蛙泳");
            }
        };
        swiming(s2);
    }

    public static void swiming(Swim s){
        s.swimming();
    }

    interface Swim{
        void swimming();
    }
}
