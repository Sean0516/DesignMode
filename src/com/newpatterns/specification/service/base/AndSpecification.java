package com.newpatterns.specification.service.base;

/**
 * Created by Sean on 2018/11/16
 *
 * @author Sean
 */
public class AndSpecification extends CompositeSpecification {
    private ISpecification left;
    private ISpecification right;

    public AndSpecification(ISpecification left, ISpecification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(Object o) {
        return left.isSatisfiedBy(o) && right.isSatisfiedBy(o);
    }
}
