package com.patternspk.adaptervsdecorator.adapter;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class TeacherImpl implements Teacher {
    @Override
    public void say() {
        System.out.println("teacher 说话");
    }

    @Override
    public void laugh() {
        System.out.println("老师大笑");
    }
}
