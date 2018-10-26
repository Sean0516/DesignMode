package com.voicecyber.memento.normal;

/**
 * Created by Sean on 2018/10/26
 *
 * @author Sean
 */
public class Caretaker {
    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
}
