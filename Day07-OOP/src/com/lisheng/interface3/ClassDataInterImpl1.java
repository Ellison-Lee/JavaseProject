package com.lisheng.interface3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClassDataInterImpl1 implements ClassDataInter{
    private Student[] students;
    public ClassDataInterImpl1()
    {
        this.students = students;
    }

    @Override
    public void printAllStudentInfos(){
        for(Student student : students)
        {
            System.out.println(student);
        }
    }

    @Override
    public void printAverageScore(){
        double sum = 0;
        for(Student student : students)
        {
            sum += student.getScore();
        }
        System.out.println("平均成绩为：" + sum/students.length);
    }
}


