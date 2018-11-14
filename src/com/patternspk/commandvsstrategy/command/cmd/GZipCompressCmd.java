package com.patternspk.commandvsstrategy.command.cmd;

/**
 * Created by Sean on 2018/11/8
 *
 * @author Sean
 */
public class GZipCompressCmd extends AbstractCmd {
    @Override
    public void execute() {
        super.gZip.compress();
    }
}
