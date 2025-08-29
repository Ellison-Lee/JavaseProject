package com.lisheng.array;

/**
 * 认识数组的定义和访问
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        randomcall();
    }

    public static void randomcall() {
        //定义一个数组，储存15个不同学生名字
        String[] names = {"lisheng", "lisheng1", "lisheng2", "lisheng3", "lisheng4", "lisheng5", "lisheng6", "lisheng7", "lisheng8", "lisheng9", "lisheng10", "lisheng11", "lisheng12", "lisheng13", "lisheng14"};
        //随机获取一个索引
        int index = (int)(Math.random()*names.length);
        System.out.println(names[index]);
    }

}
