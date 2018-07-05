package com.voicecyber.handler;

/**
 * Created by Sean on 2018/7/5
 *
 * @author Sean
 */
public class HandlerUtil {
    public static Handler getHandler(){
        Handler handler=new Handler1();
        Handler handler1=new Handler2();
        handler.setNext(handler1);
        return handler;
    }
}
