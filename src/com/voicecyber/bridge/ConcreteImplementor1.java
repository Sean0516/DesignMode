package com.voicecyber.bridge;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class ConcreteImplementor1 implements Implementor {
    @Override
    public void method() {
        System.out.println(" ConcreteImplementor1 do  method one "+this.getClass().getName());
    }

    @Override
    public void method1() {
        System.out.println(" ConcreteImplementor1 do  method two ");
    }
}
