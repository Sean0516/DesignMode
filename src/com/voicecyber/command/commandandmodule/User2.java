package com.voicecyber.command.commandandmodule;

import com.voicecyber.command.commandandmodule.model.Student;

/**
 * Created by Sean on 2018/7/3
 *
 * @author Sean
 */
public class User2 extends User {
    public User2(Student student) {
        super(student);
    }

    @Override
    void say() {
        System.out.println("user2 正在说哈");
    }

    @Override
    void run() {
        System.out.println("user2  正在跑步");
    }
}
