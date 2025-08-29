package com.lisheng.array;

public class ArrayTest6 {
    public static void main(String[] args) {
        //目标：完成数字华容道的初始化和随机乱序
        start(4);
    }

    public static void start(int n) {
        //1.定义一个二维数组
        int[][] arr = new int[n][n];

        //2.赋值
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = i * n + j + 1;
            }
        }

        printArray(arr);

        //3.打乱二维数组的元素顺序
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                int index = (int)(Math.random() * arr.length);
                int temp = arr[i][j];
                arr[i][j] = arr[i][index];
                arr[i][index] = temp;
            }
        }

        System.out.println("\n" + " 打乱之后：");
        printArray(arr);
    }

    public static void printArray(int[][] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
