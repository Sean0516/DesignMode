package com.voicecyber.mediator;

/**
 * Created by Sean on 2018/7/2
 *
 * @author Sean
 */
public class Colleague2 extends Colleague {
    public Colleague2(Mediator mediator) {
        super(mediator);
    }
    public void selfMethod(){
        System.out.println("Colleague2  自己的方法");
    }
    public void doOthorMethod(){
        mediator.getColleague1Name();
    }
}
