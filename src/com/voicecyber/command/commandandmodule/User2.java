package com.voicecyber.command.commandandmodule;

/**
 * Created by Sean on 2018/7/3
 *
 * @author Sean
 */
public class User2 extends User {
    @Override
    void say() {
        System.out.println("user2 正在说哈");
    }

    @Override
    void run() {
        System.out.println("user2  正在跑步");
    }
}
