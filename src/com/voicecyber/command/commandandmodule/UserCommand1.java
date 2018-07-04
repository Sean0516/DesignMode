package com.voicecyber.command.commandandmodule;

/**
 * Created by Sean on 2018/7/3
 *
 * @author Sean
 */
public class UserCommand1 extends UserCommand {
    private User user;
   public UserCommand1(User user){
       this.user=user;
   }
    @Override
    void execute() {
        user.doMethod();
    }
}
