package com.lisheng.abstract3;

public class Test {
    public static void main(String[] args) {
        //目标：理解抽象类的使用场景：模板方法设计模式
        //学生和老师都要写一篇作为：《我的爸爸》
        //      第一段都是一样的：我的爸爸是个好人，我来介绍一下他
        //      第二段是不一样的
        //      第三段是一样的：你有这样的爸爸吗？
        //解决：抽出一个父类，抽取一个模板方法给子类用
        Student s1 = new Student();
        s1.write();

        System.out.println("------------------");

        Teacher t1 = new Teacher();
        t1.write();
    }
}
