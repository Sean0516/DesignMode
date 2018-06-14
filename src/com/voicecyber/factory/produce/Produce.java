package com.voicecyber.factory.produce;

/**
 * Created by Sean on 2018/6/12.
 * @author Sean
 */
public abstract class Produce {
    public void common(){
        System.out.println("这是一个公共方法");
    }

    /**
     * 抽象方法
     */
    public abstract void method();
}
