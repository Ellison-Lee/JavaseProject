package com.lisheng.innerclass;

public class Outer {
    public static String schoolName = "上海大学";
    public void run()
    {
        System.out.println("run()");
    }
    public class Inner{
        private  String name;
        public void show()
        {
            System.out.println("show()");
        }

        //成员内部类访问外部成员
        //1.成员内部类可以直接访问外部类的静态成员，也可以直接访问外部类的实例成员
        public void print(){
            System.out.println(schoolName);
            run();
        }
        //2.成员内部类的实例方法中，可以直接拿到当前寄生的外部类对象，外部类名.this
        public void print2(){
            System.out.println(Outer.this);
        }
    }
}
