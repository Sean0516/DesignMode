package com.voicecyber.command.commandandmodule;

/**
 * Created by Sean on 2018/7/3
 *
 * @author Sean
 */
public class UserInvoker {
    private UserCommand command;

    public UserInvoker(UserCommand command) {
        this.command = command;
    }
    public void execute(){
        command.execute();
    }
    public void say(){
        command.say();
    }
    public void run(){
        command.add();
    }
}
