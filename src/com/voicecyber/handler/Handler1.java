package com.voicecyber.handler;

/**
 * Created by Sean on 2018/7/5
 *
 * @author Sean
 */
public class Handler1 extends Handler {
    @Override
    protected int getHandlerLevel() {
        return 1;
    }
    @Override
    protected ExtServer getResponse(String request) {
        return new ExtServer();
    }
}
