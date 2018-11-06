package com.patternspk.adaptervsdecorator.adapter;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        TeacherImpl teacher=new TeacherImpl();
        teacher.laugh();
        teacher.say();
        System.out.println("学生假装的老师----------------");
        StudentTeacher studentTeacher=new StudentTeacher();
        studentTeacher.say();
        studentTeacher.laugh();
    }
}
