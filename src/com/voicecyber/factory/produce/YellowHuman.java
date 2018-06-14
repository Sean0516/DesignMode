package com.voicecyber.factory.produce;

/**
 * Created by Sean on 2018/6/12.
 * @author Sean
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话");
    }
}
