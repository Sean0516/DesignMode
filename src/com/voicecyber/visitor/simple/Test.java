package com.voicecyber.visitor.simple;

import com.voicecyber.visitor.simple.element.ConcreteElement;
import com.voicecyber.visitor.simple.element.ConcreteElement1;
import com.voicecyber.visitor.simple.element.Element;

/**
 * Created by Sean on 2018/10/30
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Element element=new ConcreteElement() ;
        Element element1=new ConcreteElement1();
        element.accept(new Visitor());
        element1.accept(new Visitor());
    }
}
