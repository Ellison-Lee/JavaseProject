package com.lisheng.abstract3;

public abstract class People {
    //模板方法
    public final void write(){
        System.out.println("\t\t\t《我的爸爸》");
        System.out.println("我的爸爸是个好人，我来介绍一下他:");
        //定义一个抽象方法，让子类实现
        writeMain();
        System.out.println("你有这样的爸爸吗？");
    }

    public abstract void writeMain();
}
