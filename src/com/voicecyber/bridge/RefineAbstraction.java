package com.voicecyber.bridge;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class RefineAbstraction extends Abstraction {
    public RefineAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void doSomeThing() {
        super.doSomeThing();
        super.getImplementor().method1();
    }
}
