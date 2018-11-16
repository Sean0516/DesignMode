package com.newpatterns.specification.service.impl;

import com.newpatterns.specification.model.User;
import com.newpatterns.specification.service.base.CompositeSpecification;

/**
 * Created by Sean on 2018/11/16
 *
 * @author Sean
 */
public class UserNameSpecification extends CompositeSpecification {
    private String name;

    public UserNameSpecification(String name) {
        this.name = name;
    }

    @Override
    public boolean isSatisfiedBy(Object o) {
        User user = (User) o;
        return user.getName().equals(name);
    }
}
