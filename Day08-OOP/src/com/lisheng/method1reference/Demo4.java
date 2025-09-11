package com.lisheng.method1reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Demo4 {
    public static void main(String[] args) {
        //构造器引用
//        CarFactory cf = new CarFactory() {
//            @Override
//            public car getCar(String name) {
//                return new car(name);
//            }
//        };

        CarFactory cf = Car::new;
        Car c1 = cf.getCar("保时捷");
        System.out.println(c1);
    }
}

interface CarFactory{
    Car getCar(String name);
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Car{
    private  String name;
}
