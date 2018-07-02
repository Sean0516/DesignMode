package com.voicecyber.mediator;

/**
 * Created by Sean on 2018/7/2
 *
 * @author Sean
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator=mediator;
    }
}
