package com.lisheng.staticmethod;

import java.util.Random;

public class VerifyCodeUtil {
    //工具类没有创建对象的必要性，所以建议私有化构造器
    private VerifyCodeUtil() {}
    public static String getCode(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("验证码位数必须大于0");
        }

        // 定义验证码字符集：大写字母 + 小写字母 + 数字
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        // 随机选择n个字符
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(characters.length());
            code.append(characters.charAt(index));
        }

        return code.toString();
    }

}
