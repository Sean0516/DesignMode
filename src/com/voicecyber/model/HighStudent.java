package com.voicecyber.model;

/**
 * Created by Sean on 2018/6/12
 *
 * @author Sean
 */
public class HighStudent extends AbstractStudentModel {
    @Override
    protected void goSchool() {
        System.out.println("住校，自己去学习");
    }

    @Override
    protected void study() {
        System.out.println("学习 物理化学");
    }

    @Override
    protected void goHome() {
        System.out.println("一个月回家一次");
    }
}
