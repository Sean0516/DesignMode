package com.voicecyber.factory.simple;

import com.voicecyber.factory.produce.Human;

/**
 * Created by Sean on 2018/6/12.
 * @author Sean
 */
public abstract class HumanFactory {
    /**
     * 简单工厂方法。，去掉继承抽象类，并在createHuman 方法前加入static 关键字
     * @param c
     * @param <T>
     * @return
     */
    public static   <T extends Human> T createHuman(Class c) {
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
