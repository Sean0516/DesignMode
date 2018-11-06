package com.voicecyber.bridge;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Implementor implementor=new ConcreteImplementor1();
        Abstraction abstraction=new RefineAbstraction(implementor);
        abstraction.doSomeThing();
    }
}
