package com.lisheng.object;

public class Test {

    public static void main(String[] args) {
        //明星类，明星对象的模板
        //创建一个明星对象:类名 对象名 = =new 类名();
        com.lisheng.object.Star star1 = new Star();
        star1.name = "周杰伦";
        star1.age = 50;
        star1.sex = '男';
        star1.height = 1.7;
        star1.weight = 70.5;

        //创建对象，杨幂
        com.lisheng.object.Star star2 = new Star();
        star2.name = "杨幂";
        star2.age = 30;
        star2.sex = '女';
        star2.height = 1.6;
        star2.weight = 50.5;
    }
}
