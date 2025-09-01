package com.lisheng.innerclass2;

public class Outer {
    public static String schoolname = "上海大学";
    private int age;
    //静态内部类：属于外部类本身持有
    public static class Inner{
        private  String name;

        public void show(){
            System.out.println("schoolname:"+schoolname);
            // 静态内部类中不可以访问外部类的实例成员变量和实例方法
            //System.out.println("age:"+age);//错误
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}
