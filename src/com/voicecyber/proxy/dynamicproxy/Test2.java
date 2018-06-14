package com.voicecyber.proxy.dynamicproxy;

import com.voicecyber.proxy.staticproxy.Subject;

import java.lang.reflect.InvocationHandler;

/**
 * Created by Sean on 2018/6/14
 *
 * @author Sean
 */
public class Test2 {
    public static void main(String[] args) {
        Subject subject=new RealSubject();
        InvocationHandler invocationHandler=new MyInvocationHandler(subject);
        Subject proxy=DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),invocationHandler);
        proxy.doMethod();
    }
}
