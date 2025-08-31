package com.lisheng.extends1demo;
//父类，好处减少重复代码，子类继承父类属性和方法
public class People {
    private String name;
    private char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
