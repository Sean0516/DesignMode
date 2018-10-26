package com.voicecyber.memento.simple;

/**
 * Created by Sean on 2018/10/26
 * 备忘录管理员
 * @author Sean
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
