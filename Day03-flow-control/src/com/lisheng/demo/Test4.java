package com.lisheng.demo;

public class Test4 {
    public static void main(String[] args) {
        //计算1-100的质数个数
        int count = 0;
        for(int i = 1;i <= 100;i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        //从2开始找到该数的一般，如果能被整除，则不是质数
        for(int i = 2;i <= n/2;i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
