package com.voicecyber.factory.many;

import com.voicecyber.factory.produce.Produce;
import com.voicecyber.factory.produce.Produce1;

/**
 * Created by Sean on 2018/6/12.
 * @author Sean
 */
public class Produce1Factory extends AbstractProduceFactory{

    @Override
    public  Produce createProduce() {
        return new Produce1();
    }
}
