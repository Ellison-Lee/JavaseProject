package com.lisheng.thisdemo;

public class Student {
    String name;
    public void print(){
        //this 是一个变量，用在方法中，用于拿到当前对象
        //哪个对象调用这个方法，this就代表哪个对象
        System.out.println(this);
        System.out.println(this.name);
    }

    public void printHobby (String name){
        System.out.println(this.name+"喜欢"+name);
        //this用于在见名知意的情况下，不发生冲突
    }
}
