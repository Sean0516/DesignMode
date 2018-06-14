package com.voicecyber.factory.normalfactory;

import com.voicecyber.factory.produce.Human;

/**
 * Created by Sean on 2018/6/12.
 *@author Sean
 */
public abstract class AbstractFactory {
    public abstract <T extends Human> T createHuman(Class c);
}
