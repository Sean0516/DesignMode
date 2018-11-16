package com.newpatterns.specification.service.impl;

import com.newpatterns.specification.model.User;
import com.newpatterns.specification.service.base.CompositeSpecification;

/**
 * Created by Sean on 2018/11/16
 *
 * @author Sean
 */
public class UserAgeSpecification extends CompositeSpecification {
    private int age;

    public UserAgeSpecification(int age) {
        this.age = age;
    }

    @Override
    public boolean isSatisfiedBy(Object o) {
        User user = (User) o;
        return user.getAge() > age;
    }
}
