package com.lisheng.innerclass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        //目标：清楚几个匿名内部类的使用场景
        //需求：创建一个登录窗口
        JFrame win = new JFrame("登录窗口");
        win.setSize(200,200);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add( btn);

        //绑定监听器对象，对用户点击进行响应
        //开发中不是我们要主动写匿名内部类，而是用别人功能的时候，别人可以让我写一个匿名内部类，我们才写
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("用户点击了登录按钮");
            }
        });

        win.setVisible(true);
    }
}
