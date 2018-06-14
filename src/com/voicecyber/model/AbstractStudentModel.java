package com.voicecyber.model;

/**
 * Created by Sean on 2018/6/12
 *
 * @author Sean
 */
public abstract class AbstractStudentModel {
    protected abstract void goSchool();
    protected abstract void study();
    protected abstract void goHome();
    public final void run(){
        this.goSchool();
        this.study();
        this.goHome();
    }
}
