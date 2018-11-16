package com.newpatterns.specification;

import com.newpatterns.specification.model.User;
import com.newpatterns.specification.service.base.ISpecification;
import com.newpatterns.specification.service.impl.UserAgeSpecification;
import com.newpatterns.specification.service.impl.UserNameSpecification;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sean on 2018/11/16
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        List<User> userList=new ArrayList<>(4);
        userList.add(new User("sean",22));
        userList.add(new User("master",123));
        userList.add(new User("zhao",23));
        userList.add(new User("haha",333));
        ISpecification specification=new UserNameSpecification("sean");
        ISpecification ageSpecification=new UserAgeSpecification(22);
        for (User user : userList) {
            if (ageSpecification.and(specification).isSatisfiedBy(user)){
                System.out.println(user.toString());
            }
        }
    }
}
