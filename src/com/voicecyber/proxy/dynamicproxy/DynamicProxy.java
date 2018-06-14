package com.voicecyber.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Sean on 2018/6/14
 *
 * @author Sean
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){
        if (true){
            System.out.println("这是一个前置通知");
        }
        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
