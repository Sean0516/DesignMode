package com.voicecyber.strategy;

/**
 * Created by Sean on 2018/7/6
 *
 * @author Sean
 */
public class FactoryStrategy  extends AbstractFactory{
    @Override
    public <T extends Strategy> T createStrategy(Class c) {
        Strategy strategy=null;
        try {
            strategy= (Strategy) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) strategy;
    }
}
