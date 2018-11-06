package com.patternspk.proxyvsdecorator.decorator;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class StudentImpl implements Student {
    @Override
    public void showScore() {
        System.out.println("学生成绩差");
    }
}
