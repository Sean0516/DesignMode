package com.voicecyber.command.commandandmodule;

import com.voicecyber.command.commandandmodule.model.Student;

/**
 * Created by Sean on 2018/7/3
 *
 * @author Sean
 */
public abstract class User {
    public Student student;

    public User(Student student) {
        this.student = student;
    }
    public void student(){
        System.out.println(student.toString());
    }

    final  void doMethod(){
        this.student();
    }
    abstract void say();

    abstract  void run();
}
