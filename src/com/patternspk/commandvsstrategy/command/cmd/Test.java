package com.patternspk.commandvsstrategy.command.cmd;

/**
 * Created by Sean on 2018/11/8
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Invoker invoker=new Invoker(new ZipCompressCmd());
        invoker.execute();
    }

}
