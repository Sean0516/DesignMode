package com.patternspk.proxyvsdecorator.decorator;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class StudentDecorator implements Student {
    private Student student;

    public StudentDecorator(Student student) {
        this.student = student;
    }
    @Override
    public void showScore() {
        student.showScore();
    }
}
