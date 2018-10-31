package com.voicecyber.visitor.simple;

import com.voicecyber.visitor.simple.element.ConcreteElement;
import com.voicecyber.visitor.simple.element.ConcreteElement1;

/**
 * Created by Sean on 2018/10/30
 *
 * @author Sean
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(ConcreteElement element) {
        element.doSomeThing();
    }

    @Override
    public void visit(ConcreteElement1 element1) {
        element1.doSomeThing();
    }
}
