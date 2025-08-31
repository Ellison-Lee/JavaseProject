package com.lisheng.extends4constructor;

public class Teacher extends People{
    private String skill;
    public Teacher(){
    }

    public Teacher(String name,char sex,int age,String skill){
        //子类构造器调用父类构造器的应用场景
        //可以把子类继承自父类的这部分数据也完成初始化赋值
        super(name,sex,age);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
