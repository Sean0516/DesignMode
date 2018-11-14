package com.patternspk.commandvsstrategy.command.cmd;

/**
 * Created by Sean on 2018/11/8
 *
 * @author Sean
 */
public class GZipUncCompressCmd extends AbstractCmd {
    @Override
    public void execute() {
        super.gZip.unCompress();
    }
}
