package com.voicecyber.command.commandandmodule;

/**
 * Created by Sean on 2018/7/3
 *
 * @author Sean
 */
public class User1 extends User {
    @Override
    void say() {
        System.out.println("user1 正在说话");
    }

    @Override
    void run() {
        System.out.println("user1  正在跑步");
    }
}
