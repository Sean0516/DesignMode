package com.voicecyber.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Sean on 2018/6/14
 *
 * @author Sean
 */
public class MyInvocationHandler implements InvocationHandler {
    Object object=null;
    public MyInvocationHandler(Object object){
        this.object=object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.object,args);
    }
}
