package com.voicecyber.flyweight;

import java.util.HashMap;

/**
 * Created by Sean on 2018/11/5
 *
 * @author Sean
 */
public class FlyWeightFactory {
    private static HashMap<String, FlyWeight> flyWeightHashMap = new HashMap<>();

    public static FlyWeight getFlyWeight(String key) {
        FlyWeight flyWeight = null;
        if (flyWeightHashMap.containsKey(key)) {
            flyWeight = flyWeightHashMap.get(key);
        } else {
            flyWeight = new ConcreteFlyWeight(key);
            flyWeightHashMap.put(key, flyWeight);
        }
        return flyWeight;
    }
}
