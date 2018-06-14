package com.voicecyber.factory.many;

import com.voicecyber.factory.produce.Produce;
import com.voicecyber.factory.produce.Produce2;

/**
 * Created by Sean on 2018/6/12.
 * @author Sean
 */
public class Produce2Factory extends AbstractProduceFactory {
    @Override
    public  Produce createProduce() {
        return new Produce2();
    }
}
