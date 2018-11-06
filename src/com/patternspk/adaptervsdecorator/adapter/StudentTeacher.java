package com.patternspk.adaptervsdecorator.adapter;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class StudentTeacher extends StudentImpl implements Teacher{
    @Override
    public void say() {
        super.say();
    }

    @Override
    public void laugh() {
        System.out.println("学生假装老师");
        super.laugh();
    }
}
