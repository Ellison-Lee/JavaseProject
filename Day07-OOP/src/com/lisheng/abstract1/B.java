package com.lisheng.abstract1;

import lombok.Data;

@Data
//一个类继承抽象类，必须重写抽象类中的抽象方法，否则，B类也是一个抽象类
public class B extends  A{
    @Override
    public void show()
    {
        System.out.println("B类重写抽象方法");
    }
}
