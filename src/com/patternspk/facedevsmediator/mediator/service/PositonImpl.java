package com.patternspk.facedevsmediator.mediator.service;

import com.patternspk.facedevsmediator.mediator.AbstractColleague;
import com.patternspk.facedevsmediator.mediator.AbstractMediator;

/**
 * Created by Sean on 2018/11/9
 *
 * @author Sean
 */
public class PositonImpl extends AbstractColleague implements IPosition {
    public PositonImpl(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    @Override
    public void promote() {
        System.out.println("---------------------职位上升后的--------");
        super.abstractMediator.upPosition();
    }

    @Override
    public void demote() {
        System.out.println("---------------------职位下降后的--------");
        super.abstractMediator.downPosition();
    }

    @Override
    public void upPosition() {
        System.out.println("职位上升了-----------");
    }

    @Override
    public void downPosition() {
        System.out.println("真倒霉 ，职位下降了 --------------");
    }
}
