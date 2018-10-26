package com.voicecyber.command.commandandmodule;

import com.voicecyber.command.commandandmodule.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Sean on 2018/7/3
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("sean");
        student.setAge("123");
        UserCommand1 userCommand1 = new UserCommand1();
        userCommand1.setUser(new User1(student));
        UserInvoker userInvoker=new UserInvoker(userCommand1);
        userInvoker.execute();
        userInvoker.say();
        System.out.println("_________________");
        userCommand1.setUser(new User2(student));
        UserInvoker userInvoker1=new UserInvoker(userCommand1);
        userInvoker1.execute();
        userInvoker.run();

    }
}
