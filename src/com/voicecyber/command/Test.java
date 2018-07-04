package com.voicecyber.command;

/**
 * Created by Sean on 2018/7/3
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver=new Receiver1();
        Command1 command1=new Command1(receiver);
        Invoker invoker=new Invoker(command1);
        invoker.execute();
    }
}
