package com.patternspk.commandvsstrategy.strategy;

/**
 * Created by Sean on 2018/11/8
 *
 * @author Sean
 */
public class Context {
    private FileCompression fileCompression;

    public Context(FileCompression fileCompression) {
        this.fileCompression = fileCompression;
    }
    public void compress(){
        fileCompression.compress();
    }
    public void unCompress(){
        fileCompression.unCompress();
    }
}
