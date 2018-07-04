package com.voicecyber.command;

/**
 * Created by Sean on 2018/7/3
 *
 * @author Sean
 */
public class Invoker {
    private Command command;
    public Invoker(Command command){
        this.command=command;
    }
    public void execute(){
        command.execute();
    }
}
