package com.patternspk.commandvsstrategy.strategy;

/**
 * Created by Sean on 2018/11/8
 *
 * @author Sean
 */
public class GZipFile implements FileCompression {
    @Override
    public void compress() {
        System.out.println("文件压缩成功,格式为 gzip");
    }

    @Override
    public void unCompress() {
        System.out.println("gzip格式压缩文件解压成功");
    }
}
