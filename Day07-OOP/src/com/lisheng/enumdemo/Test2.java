package com.lisheng.enumdemo;

public class Test2 {
    public static void main(String[] args) {
        //目标：掌握枚举类的应用场景，做信息的分类和标志
        //需求：模拟上下左右移动图片
        //a.用常量做,但是参数值不受约束
        move(Constant.UP);

        //b.用枚举做，参数值受枚举类约束
        move2(Direction.DOWN);
    }

    public static void move(int direction) {
        switch (direction) {
        case Constant.UP:
            System.out.println("向上移动");
            break;
        case Constant.DOWN:
            System.out.println("向下移动");
            break;
        case Constant.LEFT:
            System.out.println("向左移动");
            break;
        case Constant.RIGHT:
            System.out.println("向右移动");
            break;
        default:
            System.out.println("无效的移动方向");
            break;
        }
    }

    public static void move2(Direction  direction) {
        switch (direction) {
        case UP:
            System.out.println("向上移动");
            break;
        case DOWN:
            System.out.println("向下移动");
            break;
        case LEFT:
            System.out.println("向左移动");
            break;
        case RIGHT:
            System.out.println("向右移动");
            break;
        default:
            System.out.println("无效的移动方向");
            break;
        }
    }

}
