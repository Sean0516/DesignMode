package com.voicecyber.visitor.simple.element;

import com.voicecyber.visitor.simple.IVisitor;

/**
 * Created by Sean on 2018/10/30
 *
 * @author Sean
 */
public class ConcreteElement1 extends Element{
    @Override
    public void doSomeThing() {
        System.out.println("ConcreteElement1  do  some thing ");
    }

    @Override
    public void accept(IVisitor visitor) {
    visitor.visit(this);
    }
}