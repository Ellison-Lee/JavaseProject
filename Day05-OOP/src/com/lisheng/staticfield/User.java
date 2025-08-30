package com.lisheng.staticfield;

public class User {
    public static int count = 0;

    public User(){
        // count++;
        //注意：同一个类中访问静态变量，不需要创建对象
        count++;
    }
}
