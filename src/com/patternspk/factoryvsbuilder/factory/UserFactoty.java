package com.patternspk.factoryvsbuilder.factory;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public abstract class UserFactoty {
    public static <T extends User> T createUser(Class c) {
        User user = null;
        try {
            user = (User) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) user;
    }
}
