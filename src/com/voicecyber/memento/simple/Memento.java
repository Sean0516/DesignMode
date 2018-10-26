package com.voicecyber.memento.simple;

/**
 * Created by Sean on 2018/10/26
 * 备忘录角色
 *
 * @author Sean
 */
public class Memento<T> {
    private T state;

    public Memento(T state) {
        this.state = state;
    }

    public T getState() {
        return state;
    }

    public void setState(T state) {
        this.state = state;
    }
}
