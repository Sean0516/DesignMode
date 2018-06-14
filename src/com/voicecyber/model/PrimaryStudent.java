package com.voicecyber.model;

/**
 * Created by Sean on 2018/6/12
 *
 * @author Sean
 */
public class PrimaryStudent  extends AbstractStudentModel{
    @Override
    protected void goSchool() {
        System.out.println("父母送");
    }

    @Override
    protected void study() {
        System.out.println("语数外");
    }

    @Override
    protected void goHome() {
        System.out.println("父母接");
    }
}
