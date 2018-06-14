package com.voicecyber.proxy.dynamicproxy;

import com.voicecyber.proxy.staticproxy.Subject;

/**
 * Created by Sean on 2018/6/14
 *
 * @author Sean
 */
public class RealSubject implements Subject {
    @Override
    public void doMethod() {
        System.out.println("动态代理调用真实的方法");
    }
}
