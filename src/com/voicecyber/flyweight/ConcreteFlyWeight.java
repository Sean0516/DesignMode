package com.voicecyber.flyweight;

/**
 * Created by Sean on 2018/11/5
 *
 * @author Sean
 */
public class ConcreteFlyWeight extends FlyWeight {
    public ConcreteFlyWeight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void method() {
        System.out.println("start do method by key " + extrinsic);
    }
}
