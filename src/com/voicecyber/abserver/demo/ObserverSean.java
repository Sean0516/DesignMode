package com.voicecyber.abserver.demo;

/**
 * Created by Sean on 2018/7/10
 *
 * @author Sean
 */
public class ObserverSean implements Observer {
    @Override
    public void update(String str) {
        System.out.println("ObserverSean 接收到被观察者的消息"+str);
    }
}
