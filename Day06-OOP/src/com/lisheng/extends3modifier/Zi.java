package com.lisheng.extends3modifier;

import com.lisheng.extends2modifier.Fu;

public class Zi extends Fu {
    public void show()
    {
        protectedMethod2();
        publicMethod();
        //privateMethod();
        //method();
    }
}
