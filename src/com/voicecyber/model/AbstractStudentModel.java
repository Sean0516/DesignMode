package com.voicecyber.model;

/**
 * Created by Sean on 2018/6/12
 * 模板方法
 * @author Sean
 */
public abstract class AbstractStudentModel {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println("公共方法" + name);
    }

    protected abstract void goSchool();

    protected abstract void study();

    protected abstract void goHome();

    public final String run() {
        this.test();
        this.goSchool();
        this.study();
        this.goHome();
        return name;
    }
}
