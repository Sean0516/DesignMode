package com.patternspk.facedevsmediator.mediator.service;

import com.patternspk.facedevsmediator.mediator.AbstractColleague;
import com.patternspk.facedevsmediator.mediator.AbstractMediator;

/**
 * Created by Sean on 2018/11/9
 *
 * @author Sean
 */
public class TaxImpl extends AbstractColleague implements ITax {
    public TaxImpl(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }
    @Override
    public void raiseTax() {
        System.out.println("--------------税率上升后------------");
        super.abstractMediator.upTax();
    }

    @Override
    public void dropTax() {
        System.out.println("--------------税率下降后------------");
        super.abstractMediator.downTax();
    }

    @Override
    public void upTax() {
        System.out.println("工资税率上升了 ----");
    }

    @Override
    public void downTax() {
        System.out.println("工资税率降低了-------------");
    }


}
