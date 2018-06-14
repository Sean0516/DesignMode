package com.voicecyber.proxy.staticproxy;

/**
 * Created by Sean on 2018/6/14
 *
 * @author Sean
 */
public class StaticProxy implements Subject {
    private Subject subject=null;
    public StaticProxy (){
        subject=new RealSubject(this);
    }
    @Override
    public void doMethod() {
    this.subject.doMethod();
    }
}
