package com.voicecyber.mediator;

/**
 * Created by Sean on 2018/7/2
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator=new ConcreteMediator();
        Colleague1 colleague1=new Colleague1(mediator);
        colleague1.selfMethod();
        colleague1.doOtherMethod();
    }
}
