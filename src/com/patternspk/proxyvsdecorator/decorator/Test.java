package com.patternspk.proxyvsdecorator.decorator;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Student student=new StudentImpl();
        student.showScore();
        System.out.println("美化成绩--------------");
        student=new BeautifyStudent(student);
        student.showScore();
    }
}
