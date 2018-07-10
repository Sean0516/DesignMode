package com.voicecyber.abserver.demo;

import java.util.Vector;

/**
 * Created by Sean on 2018/7/10
 *
 * @author Sean
 */
public abstract class Subject {
    private Vector<Observer> observerVector=new Vector<>();
    public void add(Observer observer){
        this.observerVector.add(observer);
    }
    public void delete(Observer observer){
        this.observerVector.remove(observer);
    }
    public void notifyAllObserver(String str){
        if (observerVector.size()>0){
            for (Observer observer : observerVector) {
                observer.update(str);
            }
        }
    }
}
