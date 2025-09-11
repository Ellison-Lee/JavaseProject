package com.lisheng.method1reference;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        //目标：特定类型的方法引用
        //需求：有一个字符串数组，里面有一些人的名字，英文名称，需要按照首字母升序排序
        String[] names = {"Tom","Jerry","Mike","Marry","Tommy","Andy","angle","Lucy","曹操","Jack"};

        //排序
        //Arrays.sort(names, (String o1, String o2) -> o1.compareToIgnoreCase(o2));
        //特定类型引用
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));
    }
}
