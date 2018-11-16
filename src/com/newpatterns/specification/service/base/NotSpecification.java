package com.newpatterns.specification.service.base;

/**
 * Created by Sean on 2018/11/16
 *
 * @author Sean
 */
public class NotSpecification extends CompositeSpecification {
    private ISpecification specification;

    public NotSpecification(ISpecification specification) {
        this.specification = specification;
    }

    @Override
    public boolean isSatisfiedBy(Object o) {
        return !specification.isSatisfiedBy(o);
    }
}
