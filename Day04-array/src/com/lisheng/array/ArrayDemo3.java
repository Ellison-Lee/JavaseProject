package com.lisheng.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //目标：完成数组求最值
        int[] scores = {100, 90, 80, 70, 60};
        int max = getMax(scores);
        System.out.println("最大值为：" + max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
