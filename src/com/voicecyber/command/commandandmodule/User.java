package com.voicecyber.command.commandandmodule;

/**
 * Created by Sean on 2018/7/3
 *
 * @author Sean
 */
public abstract class User {
    final  void doMethod(){
        this.say();
        this.run();
    }
    abstract void say();

    abstract  void run();
}
