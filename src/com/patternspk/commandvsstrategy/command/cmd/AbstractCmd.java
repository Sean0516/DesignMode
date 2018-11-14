package com.patternspk.commandvsstrategy.command.cmd;

import com.patternspk.commandvsstrategy.command.receiver.GZipReceiver;
import com.patternspk.commandvsstrategy.command.receiver.IReceiver;
import com.patternspk.commandvsstrategy.command.receiver.ZipReceiver;

/**
 * Created by Sean on 2018/11/8
 *
 * @author Sean
 */
public abstract class AbstractCmd {
    protected IReceiver zip=new ZipReceiver();
    protected IReceiver gZip=new GZipReceiver();
    public abstract void execute();
}
