package com.patternspk.facedevsmediator.mediator;

import com.patternspk.facedevsmediator.mediator.service.ISalary;
import com.patternspk.facedevsmediator.mediator.service.SalaryImpl;

/**
 * Created by Sean on 2018/11/9
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator=new Mediator();
        ISalary iSalary=new SalaryImpl(mediator);
        iSalary.increaseSalary();
        iSalary.decreaseSalary();
    }
}
