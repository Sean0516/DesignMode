package com.voicecyber.handler;

/**
 * Created by Sean on 2018/9/6
 *
 * @author Sean
 */
public class ExtServer2 implements IExtServer {
    @Override
    public void add(String name) {
        System.out.println(" ExtServer2 add ext " +name);
    }

    @Override
    public void edit(String name) {
        System.out.println("ExtServer2 edit ext" +name);
    }
}
