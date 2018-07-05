package com.voicecyber.mediator;

/**
 * Created by Sean on 2018/7/2
 *中介者模式
 * @author Sean
 */
public abstract class Mediator {
    protected Colleague1 colleague1;
    protected Colleague2 colleague2;

    public Mediator(){
        colleague1=new Colleague1(this);
        colleague2=new Colleague2(this);
    }

    public abstract void getColleague1Name();

    public abstract void getColleague2Name();
}
