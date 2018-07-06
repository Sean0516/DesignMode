package com.voicecyber.strategy;

/**
 * Created by Sean on 2018/7/6
 *
 * @author Sean
 */
public class FactoryTest {
    public static void main(String[] args) {
        FactoryStrategy factoryStrategy = new FactoryStrategy();
        Strategy strategy = factoryStrategy.createStrategy(Strategy1.class);
        strategy.method1();
        strategy.method2();
    }
}
