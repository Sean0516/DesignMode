package com.voicecyber.visitor.simple.element;

import com.voicecyber.visitor.simple.IVisitor;

/**
 * Created by Sean on 2018/10/30
 *
 * @author Sean
 */
public abstract class Element {
    public abstract void doSomeThing();
    public abstract void  accept(IVisitor visitor);
}
