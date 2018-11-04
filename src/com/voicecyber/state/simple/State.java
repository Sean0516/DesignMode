package com.voicecyber.state.simple;

/**
 * Created by Sean on 2018/10/31
 *
 * @author Sean
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }
    public abstract void handle1();
    public abstract void handle2();
}
