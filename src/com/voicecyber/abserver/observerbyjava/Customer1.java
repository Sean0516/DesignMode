package com.voicecyber.abserver.observerbyjava;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sean on 2018/7/10
 *
 * @author Sean
 */
public class Customer1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("被观察者发生行为:"+arg.toString());
    }
}
