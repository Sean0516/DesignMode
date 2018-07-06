package com.voicecyber.handler;

/**
 * Created by Sean on 2018/7/5
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Handler handler = HandlerUtil.getHandler();
        String s = handler.handlerMessage("hello handler1", 1);
        String s1 = handler.handlerMessage("hello  handler2  ", 2);
        System.out.println(s1);
        System.out.println(s);
    }
}
