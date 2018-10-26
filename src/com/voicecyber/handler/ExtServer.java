package com.voicecyber.handler;

/**
 * Created by Sean on 2018/9/6
 *
 * @author Sean
 */
public class ExtServer implements IExtServer {
    @Override
    public void add(String name) {
        System.out.println("ExtServer add ext " +name);
    }

    @Override
    public void edit(String name) {
        System.out.println(" ExtServeredit ext" +name);
    }
}
