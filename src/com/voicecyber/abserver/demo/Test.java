package com.voicecyber.abserver.demo;

/**
 * Created by Sean on 2018/7/10
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Observer observer=new ObserverSean();
        Observer observer1=new ObserverMaster();
        ConcreteSubject subject=new ConcreteSubject();
        subject.add(observer);
        subject.add(observer1);
        subject.doSomeThing();
    }
}
