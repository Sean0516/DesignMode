package com.patternspk.facedevsmediator.mediator.service;

import com.patternspk.facedevsmediator.mediator.AbstractColleague;
import com.patternspk.facedevsmediator.mediator.AbstractMediator;

/**
 * Created by Sean on 2018/11/9
 *
 * @author Sean
 */
public class SalaryImpl extends AbstractColleague implements ISalary {
    public SalaryImpl(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    @Override
    public void increaseSalary() {
        System.out.println("---------------------工资上升后的--------");
        super.abstractMediator.upSalary();
    }

    @Override
    public void decreaseSalary() {
        System.out.println("---------------------工资下降后的--------");
        super.abstractMediator.downSalary();
    }

    @Override
    public void upSalary() {
        System.out.println("涨工资了 ，真开心");
    }

    @Override
    public void downSalary() {
        System.out.println("呀，降工资了 啊 ------------");
    }
}
