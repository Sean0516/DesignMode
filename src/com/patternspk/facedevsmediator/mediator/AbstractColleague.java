package com.patternspk.facedevsmediator.mediator;

/**
 * Created by Sean on 2018/11/9
 *
 * @author Sean
 */
public abstract class AbstractColleague {
    protected AbstractMediator abstractMediator;

    public AbstractColleague(AbstractMediator abstractMediator) {
        this.abstractMediator = abstractMediator;
    }
}
