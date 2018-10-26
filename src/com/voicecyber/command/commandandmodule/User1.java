package com.voicecyber.command.commandandmodule;

import com.voicecyber.command.commandandmodule.model.Student;

/**
 * Created by Sean on 2018/7/3
 *
 * @author Sean
 */
public class User1 extends User {
    public User1(Student student) {
        super(student);
    }

    @Override
    void say() {
        System.out.println("user1 正在说话"+ student.getName());
    }

    @Override
    void run() {
        System.out.println("user1  正在跑步");
    }
}
