package com.voicecyber.factory;

import com.voicecyber.factory.many.AbstractProduceFactory;
import com.voicecyber.factory.many.Produce1Factory;
import com.voicecyber.factory.many.Produce2Factory;
import com.voicecyber.factory.normalfactory.AbstractFactory;
import com.voicecyber.factory.normalfactory.HumanFactory;
import com.voicecyber.factory.produce.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Created by Sean on 2018/6/12.
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        /**
         * test normal factory
         */
//        AbstractFactory humanFactory=new HumanFactory();
//        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
//        blackHuman.getColor();
//        blackHuman.talk();
//        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
//        yellowHuman.getColor();
//        yellowHuman.talk();
        /**
         * test simple factory
         */
//        BlackHuman blackHuman= com.voicecyber.factory.simple.HumanFactory.createHuman(BlackHuman.class);
//        blackHuman.getColor();
//        YellowHuman yellowHuman= com.voicecyber.factory.simple.HumanFactory.createHuman(YellowHuman.class);
//        yellowHuman.getColor();

        /**
         * test many factory
         */
        AbstractProduceFactory produce1Factory =new Produce1Factory();
        Produce produce1 = produce1Factory.createProduce();
        produce1.common();
        produce1.method();
        AbstractProduceFactory produce2Factory=new Produce2Factory();
        Produce produce2 = produce2Factory.createProduce();
        produce2.common();
        produce2.method();

    }
}
