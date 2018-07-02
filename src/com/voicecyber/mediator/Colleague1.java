package com.voicecyber.mediator;

/**
 * Created by Sean on 2018/7/2
 *
 * @author Sean
 */
public class Colleague1 extends Colleague {
    public Colleague1(Mediator mediator) {
        super(mediator);
    }
    public void selfMethod(){
        System.out.println("Colleague1  自己的方法");
    }
    public void doOtherMethod(){
        System.out.println("colleague1 调用 colleague2 的方法 ");
        mediator.getColleague2Name();
    }
}
