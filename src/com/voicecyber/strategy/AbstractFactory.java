package com.voicecyber.strategy;

import com.voicecyber.factory.produce.Human;

/**
 * Created by Sean on 2018/7/6
 *
 * @author Sean
 */
public abstract class AbstractFactory {
        public abstract <T extends Strategy> T createStrategy(Class c);
}
