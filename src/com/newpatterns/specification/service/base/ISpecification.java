package com.newpatterns.specification.service.base;

/**
 * Created by Sean on 2018/11/16
 *
 * @author Sean
 */
public interface ISpecification {
     boolean isSatisfiedBy(Object o);
    ISpecification and(ISpecification specification);
    ISpecification or(ISpecification specification);
    ISpecification not();
}
