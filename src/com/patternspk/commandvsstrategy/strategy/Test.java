package com.patternspk.commandvsstrategy.strategy;

/**
 * Created by Sean on 2018/11/8
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Context context=new Context(new ZipFile());
        context.compress();
        context.unCompress();
        context=new Context(new GZipFile());
        context.compress();
        context.unCompress();
    }
}
