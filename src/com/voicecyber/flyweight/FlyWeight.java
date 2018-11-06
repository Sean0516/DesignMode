package com.voicecyber.flyweight;

/**
 * Created by Sean on 2018/11/5
 *
 * @author Sean
 */
public abstract class FlyWeight {
    /**
     * 外部状态
     */
    protected final String extrinsic;

    public FlyWeight(String extrinsic) {
       this.extrinsic = extrinsic;
    }
    public abstract void method();

}
