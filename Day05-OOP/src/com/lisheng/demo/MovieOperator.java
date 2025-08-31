package com.lisheng.demo;

import java.util.Scanner;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(Movie[] movies){
        this.movies = movies;
    }

    //打印所有影片信息
    public void printAllMovies(){
        System.out.println("======所有影片信息如下：=========");
        System.out.println("编号\t名称\t价格\t主演");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getPrice()+"\t"+m.getActor());
        }
    }

    public void searchByID(){
        System.out.println("请输入要查询的影片编号：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if(m.getId() == id){
                System.out.println("编号\t名称\t价格\t主演");
                System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getPrice()+"\t"+m.getActor());
                return; //找到就提前返回
            }
        }
        System.out.println("没有找到该编号的影片！");
    }
}
