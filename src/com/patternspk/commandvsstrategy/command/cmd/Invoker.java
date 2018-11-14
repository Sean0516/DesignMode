package com.patternspk.commandvsstrategy.command.cmd;

/**
 * Created by Sean on 2018/11/8
 *
 * @author Sean
 */
public class Invoker {
    private AbstractCmd abstractCmd;

    public Invoker(AbstractCmd abstractCmd) {
        this.abstractCmd = abstractCmd;
    }
    public void execute(){
        abstractCmd.execute();
    }
}
