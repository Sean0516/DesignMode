package com.patternspk.adaptervsdecorator.adapter;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class StudentImpl implements Student{
    @Override
    public void say() {
        System.out.println("student say ");
    }

    @Override
    public void laugh() {
        System.out.println("student laugh");
    }
}
