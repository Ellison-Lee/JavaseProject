package com.lisheng.feature;

public class Test2 {
    public static void main(String[] args) {
        //目标：继承后子类的访问特点：就近原则
        Zi zi = new Zi();
        zi.show();
    }
}

    class Fu{
        String name = "父类成员变量";
    }

    class Zi extends Fu{
        String name = "子类成员变量";
        public void show(){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(super.name);
        }
    }
