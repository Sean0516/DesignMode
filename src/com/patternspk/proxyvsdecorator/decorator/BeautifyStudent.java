package com.patternspk.proxyvsdecorator.decorator;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class BeautifyStudent extends StudentDecorator {
    public BeautifyStudent(Student student) {
        super(student);
    }

    @Override
    public void showScore() {
        System.out.println("闭关修炼三个月 ，成绩大涨");
    }
}
