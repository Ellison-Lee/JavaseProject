package com.lisheng.interface3;

public class Test {
    public static void main(String[] args) {
        //目标：完成接口小案例
        //1.定义学生类，创建学生对象，封装学生数据
        //2.准备学生数据
        Student[] allStudents = new Student[3];
        allStudents[0] = new Student("lisheng",'男',25);
        allStudents[1] = new Student("赵敏",'女',18);
        allStudents[2] = new Student("小龙",'男',18);

        //3.提供2套业务实现方案，实现解耦合：面向接口编程
        //      --定义一个接口：打印全班信息，打印平均分
        //      --定义第一套实现类，实现打印全班信息，打印平均分
        //      --定义第二套实现类，实现打印全班信息（男女），打印平均分（男女）
        ClassDataInter cdi = new ClassDataInterImpl2(allStudents);
        cdi.printAllStudentInfos();
        cdi.printAverageScore();
    }
}
