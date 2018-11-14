package com.patternspk.facedevsmediator.mediator;

/**
 * Created by Sean on 2018/11/9
 *
 * @author Sean
 */
public class Mediator extends AbstractMediator {
    @Override
    public void upPosition() {
        super.position.upPosition();
        super.salary.upSalary();
        super.tax.upTax();
    }

    @Override
    public void downPosition() {
        super.position.downPosition();
        super.salary.downSalary();
        super.tax.downTax();
    }

    @Override
    public void upSalary() {
        super.salary.upSalary();
        super.tax.upTax();
    }

    @Override
    public void downSalary() {
        super.salary.downSalary();
        super.tax.downTax();
    }

    @Override
    public void upTax() {
        super.tax.upTax();
        super.salary.downSalary();
    }

    @Override
    public void downTax() {
        super.tax.downTax();
        super.salary.upSalary();
    }
}
