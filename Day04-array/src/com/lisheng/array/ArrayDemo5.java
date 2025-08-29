package com.lisheng.array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //认识二位数组
        printarray();
    }

    public static void printarray(){
        //初始化二维数组，储存5行3列的元素
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
                {13,14,15}
        };

        //访问二维数组的元素
        System.out.println(arr[0][0]);
        System.out.println("==========================");

        //打印二维数组
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println('\n');
        }
    }
}
