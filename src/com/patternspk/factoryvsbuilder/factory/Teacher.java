package com.patternspk.factoryvsbuilder.factory;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class Teacher  implements User{
    @Override
    public void userName() {
        System.out.println("teacher user name");
    }

    @Override
    public void userAge() {
        System.out.println("teacher user age");
    }
}
