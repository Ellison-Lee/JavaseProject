package com.lisheng.demo;

public class Test {
    public static void main(String[] args) {
        //目标：完成面向对象的综合小案例

        //1.设计电影类Movie
        //2.封装系统中的全部电影数据
        Movie[] movies = new Movie[5];//movies = [null, null, null, null, null]
        movies[0] = new Movie(1, "唐顿庄园", 9.5, "罗宾·怀特");
        movies[1] = new Movie(2, "星际穿越", 9.5, "莱昂纳多·迪卡普里奥");
        movies[2] = new Movie(3, "流浪地球", 9.5, "吴京");
        movies[3] = new Movie(4, "让子弹飞", 9.5, "娜塔莎·波特曼");
        movies[4] = new Movie(5, "F1", 9.5, "莱昂纳多·迪卡普里奥");

        //3.完成电影业务功能
        MovieOperator operator = new MovieOperator(movies);
        operator.printAllMovies();
        operator.searchByID();
    }
}
