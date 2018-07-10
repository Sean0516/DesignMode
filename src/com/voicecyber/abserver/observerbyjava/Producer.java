package com.voicecyber.abserver.observerbyjava;

import java.util.Observable;

/**
 * Created by Sean on 2018/7/10
 *
 * @author Sean
 */
public class Producer extends Observable {
    public void producerProduct1(){
        System.out.println("生产产品1");
        super.setChanged();
        super.notifyObservers("Producer 生产了产品1 ");
    }
    public void producerProduct2(){
        System.out.println("生产产品2");
        super.setChanged();
        super.notifyObservers("produce 生产了产品2");
    }

}
