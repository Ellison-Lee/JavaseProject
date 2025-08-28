package com.lisheng.demo;

public class Test3 {
    public static void main(String[] args) {
        //开发验证码
        //调用一个方法返回执行位数的验证码，每位只能是数字和字母
        String code = getCode();
        System.out.println(code);
    }

    public static String getCode() {
        //获取验证码，每一位可能是小写字母，大写字母，数字
        String code = "";
        for (int i = 0; i < 4; i++) {
            int number = (int)(Math.random() * 10);
            code += number;
            code += (char)(Math.random() * 26 + 'a');
            code += (char)(Math.random() * 26 + 'A');
            code += (char)(Math.random() * 10 + '0');
        }
        return code;
    }
}
