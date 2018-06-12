package com.voicecyber.singleton;

/**
 * Created by Sean on 2018/6/8.
 *
 */
/**
 * 饿汉式单例模式  线程安全
 * @author Sean
 */
public class HungryPattern {
    public static final HungryPattern hungryPattern=new HungryPattern();
    private HungryPattern(){}
    public HungryPattern getHungryPattern(){
        return hungryPattern;
    }
    public static void say(){
        System.out.println("这是一个饿汉式单例模式");
    }
}
