package com.voicecyber.command.commandandmodule;

/**
 * Created by Sean on 2018/7/3
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {

        UserInvoker userInvoker=new UserInvoker(new UserCommand1(new User2()));
        userInvoker.execute();
        System.out.println("_________________");
        UserInvoker userInvoker1=new UserInvoker(new UserCommand1(new User1()));
        userInvoker1.execute();
    }
}
