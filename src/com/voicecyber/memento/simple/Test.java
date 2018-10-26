package com.voicecyber.memento.simple;

/**
 * Created by Sean on 2018/10/26
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Originator originator=new Originator();
        originator.setName("sean");
        originator.setSex("男");
        originator.setAge(22);
        CaretakerById caretakerById=new CaretakerById();
        caretakerById.setMemento("001",originator.createMemento());
        System.out.println("为修改之前："+originator.toString());
        originator.setName("master ");
        originator.setSex("女");
        System.out.println("为修改之后："+originator.toString());
        originator.restoreMemento(caretakerById.getMemento("001"));
        System.out.println("恢复之后： "+originator.toString());
    }
}
