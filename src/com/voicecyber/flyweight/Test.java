package com.voicecyber.flyweight;

/**
 * Created by Sean on 2018/11/5
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        FlyWeightFactory.getFlyWeight("sean").method();
        FlyWeightFactory.getFlyWeight("sean").method();
        FlyWeightFactory.getFlyWeight("sean2").method();
    }
}
