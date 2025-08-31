package com.lisheng.extends4constructor;

public class Test {
    public static void main(String[] args) {
        //目标：认识子类构造器的特点，再看应用场景
        //子类构造器会自动调用父类的无参构造器，再调用子类的构造器
        Zi zi = new Zi();
    }
}

class Zi extends Fu {
    public Zi() {
        //super();默认存在，写不写都有
        //super(10); 指定调用父类有参构造器
        System.out.println("子类无参构造器");
    }
}

class Fu {
    public Fu() {
        System.out.println("父类无参构造器");
    }

    public Fu(int a){
        System.out.println("父类有参构造器");
    }
}
