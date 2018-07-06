package com.voicecyber.strategy;

/**
 * Created by Sean on 2018/7/6
 *
 * @author Sean
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void doMethod1(){
        strategy.method1();
    }
    public void doMethod2(){
        strategy.method2();
    }
}
