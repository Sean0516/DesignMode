package com.patternspk.facedevsmediator.mediator;

import com.patternspk.facedevsmediator.mediator.service.*;

/**
 * Created by Sean on 2018/11/9
 *
 * @author Sean
 */
public abstract class AbstractMediator {
    protected IPosition position ;
    protected ISalary salary;
    protected ITax tax;

    public AbstractMediator() {
        position =new PositonImpl(this);
        salary=new SalaryImpl(this);
        tax=new TaxImpl(this);
    }

    public abstract void upPosition();
    public abstract void downPosition();
    public abstract void upSalary();
    public abstract void downSalary();
    public abstract void upTax();
    public abstract void downTax();
}
