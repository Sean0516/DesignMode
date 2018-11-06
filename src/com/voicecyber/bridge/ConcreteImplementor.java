package com.voicecyber.bridge;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class ConcreteImplementor implements Implementor {
    @Override
    public void method() {
        System.out.println(" ConcreteImplementor do  method one ");
    }

    @Override
    public void method1() {
        System.out.println(" ConcreteImplementor do method  two");
    }
}
