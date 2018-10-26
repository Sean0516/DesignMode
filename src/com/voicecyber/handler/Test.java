package com.voicecyber.handler;

/**
 * Created by Sean on 2018/7/5
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Handler handler = HandlerUtil.getHandler();
        ExtServer extServer = (ExtServer) handler.handlerMessage("hello handler1", 1);
        extServer.add("sean");
        extServer.edit("test");
        ExtServer2 extServer2 = (ExtServer2) handler.handlerMessage("hello  handler2  ", 2);
        extServer2.add("master");
        extServer2.edit("1111");
    }
}
