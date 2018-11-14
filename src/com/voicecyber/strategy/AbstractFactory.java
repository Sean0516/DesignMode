package com.voicecyber.strategy;


/**
 * Created by Sean on 2018/7/6
 *
 * @author Sean
 */
public abstract class AbstractFactory {
        public abstract <T extends Strategy> T createStrategy(Class c);
}
