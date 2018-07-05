package com.voicecyber.handler;

/**
 * Created by Sean on 2018/7/5
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Handler handler = HandlerUtil.getHandler();
        String s = handler.handlerMessage("hello handler1", 0);
        System.out.println(s);
    }
}
