package com.voicecyber.proxy.staticproxy;

/**
 * Created by Sean on 2018/6/14
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Subject subject=new StaticProxy();
        subject.doMethod();
    }
}
