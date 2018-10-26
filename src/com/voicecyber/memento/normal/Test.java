package com.voicecyber.memento.normal;

/**
 * Created by Sean on 2018/10/26
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Originator originator=new Originator();
        originator.setName("hello");
        originator.setSex("boy");
        Caretaker caretaker=new Caretaker();
        System.out.println("为修改之前："+originator.toString());
        caretaker.setMemento( originator.createMemento());
        originator.setName("world");
        System.out.println("为修改之后："+originator.toString());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复之后： "+originator.toString());
    }
}
