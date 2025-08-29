package com.lisheng.array;

public class ArrayTest4 {
    public static void main(String[] args) {
        //目标：完成斗地主游戏的做牌和洗牌
        startPoker();
    }

    public static void startPoker() {
        // 1.做牌：创建动态初始化数组，保存54张牌
        String[] poker = new String[54];
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        //2.先遍历点数再遍历花色
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                poker[index] = colors[j] + numbers[i];
                index++;
            }
        }

        //3.添加大小王
        poker[index] = "小王";
        poker[index + 1] = "大王";

        //打印牌
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + "\t");
        }

        //4.洗牌
        for (int i = 0; i < poker.length; i++) {
            //随机索引
            int index2 = (int)(Math.random()*poker.length);
            //随机另一个索引
            int index3 = (int)(Math.random()*poker.length);
            String temp = poker[index2];
            poker[index2] = poker[index3];
            poker[index3] = temp;
        }
        System.out.println("\n"+" 洗牌之后：");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + "\t");
        }
    }
}
