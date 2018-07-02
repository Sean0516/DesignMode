package com.voicecyber.mediator;

/**
 * Created by Sean on 2018/7/2
 *
 * @author Sean
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void getColleague1Name() {
        super.colleague1.selfMethod();
    }
    @Override
    public void getColleague2Name() {
        super.colleague2.selfMethod();
    }
}
