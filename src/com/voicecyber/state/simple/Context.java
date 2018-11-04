package com.voicecyber.state.simple;

/**
 * Created by Sean on 2018/10/31
 *
 * @author Sean
 */
public class Context {
    public final static State STATE1 = new UserState();
    public final static State STATE2 = new StudentState();
    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }

    public void handle1() {
        this.currentState.handle1();
    }

    public void handle2() {
        this.currentState.handle2();
    }
}
