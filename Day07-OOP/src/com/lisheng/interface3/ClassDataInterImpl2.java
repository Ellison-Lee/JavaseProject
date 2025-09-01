package com.lisheng.interface3;

public class ClassDataInterImpl2 implements ClassDataInter{
    //--定义第二套实现类，实现分男女打印全班信息，打印平均分
    private Student[] students;
    public ClassDataInterImpl2(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentInfos() {
        for(Student student : students)
        {
            if(student.getSex() == '女')
            {
                System.out.println(student);
            }
        }
        for(Student student : students)
        {
            if(student.getSex() == '男')
            {
                System.out.println(student);
            }
        }
    }

    @Override
    public void printAverageScore() {
        System.out.println("平均分如下：");
        double malesum = 0;
        double femalesum = 0;
        int malecount = 0;
        int femalecount = 0;
        for(Student student : students){
            if(student.getSex() == '女'){
                femalesum += student.getScore();
                femalecount++;
            }
            else{
                malesum += student.getScore();
                malecount++;
            }
        }
        System.out.println("平均女同学的分数为：" + femalesum/femalecount);
        System.out.println("平均男同学的分数为：" + malesum/malecount);
    }
}
