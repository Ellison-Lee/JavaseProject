package com.lisheng.extends4constructor;

public class Test2 {
    public static void main(String[] args){
        //目标：子类构造器调用父类构造器
        Teacher t1 = new Teacher("小王",'男',25,"java");
        System.out.println(t1.getName() + " " + t1.getSex() + " " + t1.getAge() + " " + t1.getSkill());
    }
}
