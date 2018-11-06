package com.voicecyber.bridge;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public abstract class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void doSomeThing() {
        this.implementor.method();
    }

    public Implementor getImplementor() {
        return implementor;
    }
}
