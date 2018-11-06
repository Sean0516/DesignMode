package com.patternspk.factoryvsbuilder.factory;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class Student implements User {
    @Override
    public void userName() {
        System.out.println("student userName");
    }

    @Override
    public void userAge() {
        System.out.println("student age ");
    }
}
