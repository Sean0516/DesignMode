package com.patternspk.factoryvsbuilder.factory;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        User user = UserFactoty.createUser(Student.class);
        user.userAge();
        user.userName();
    }
}
