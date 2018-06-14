package com.voicecyber.factory.normalfactory;

import com.voicecyber.factory.produce.Human;

/**
 * Created by Sean on 2018/6/12.
 * @author Sean
 */
public class HumanFactory extends AbstractFactory {
    @Override
    public <T extends Human> T createHuman(Class c) {
        Human human=null;
        try {
            human= (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
