package com.voicecyber.abserver.demo;

/**
 * Created by Sean on 2018/7/10
 *
 * @author Sean
 */
public class ConcreteSubject extends Subject {
    public void doSomeThing(){
        System.out.println("被观察者发生行为，准备通知观察者");
        super.notifyAllObserver("你好这里是被观察者");
        System.out.println("被观察者 结束");
    }
}
