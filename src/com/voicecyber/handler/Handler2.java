package com.voicecyber.handler;

/**
 * Created by Sean on 2018/7/5
 *
 * @author Sean
 */
public class Handler2 extends Handler {
    @Override
    protected int getHandlerLevel() {
        return 2;
    }

    @Override
    protected ExtServer2 getResponse(String request) {
        return new ExtServer2();
    }
}
