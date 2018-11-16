package com.newpatterns.specification.service.base;

/**
 * Created by Sean on 2018/11/16
 *
 * @author Sean
 */
public abstract class CompositeSpecification  implements ISpecification{
    @Override
    public  abstract  boolean isSatisfiedBy(Object o) ;

    @Override
    public ISpecification and(ISpecification specification) {
        return new AndSpecification(this,specification);
    }

    @Override
    public ISpecification or(ISpecification specification) {
        return new OrSpecification(this,specification);
    }

    @Override
    public ISpecification not() {
        return new NotSpecification(this);
    }
}
