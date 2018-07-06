package com.voicecyber.strategy;

/**
 * Created by Sean on 2018/7/6
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
     Strategy strategy1=new Strategy1();
     Context context=new Context(strategy1);
     context.doMethod1();
     context.doMethod2();
     Strategy strategy2=new Strategy2();
     Context context1=new Context(strategy2);
     context1.doMethod2();
     context1.doMethod1();
    }
}
