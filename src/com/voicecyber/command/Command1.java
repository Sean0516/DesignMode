package com.voicecyber.command;

/**
 * Created by Sean on 2018/7/3
 *
 * @author Sean
 */
public class Command1 extends Command {
   private Receiver receiver;
   public Command1(Receiver receiver){
       this.receiver=receiver;
   }
    @Override
    void execute() {
        receiver.say();
    }
}
