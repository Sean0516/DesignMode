package com.voicecyber.singleton;

/**
 * Created by Sean on 2018/6/8.
 */

import java.util.concurrent.*;

/**
 * 使用每集实现线程安全的单例模式
 *
 * @author Sean
 */
public class EnumSingletonPattern {
    private EnumSingletonPattern() {
    }

    private static EnumSingletonPattern getEnumSingletonPattern() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;
        private EnumSingletonPattern singleton;

        /**
         * JVM会保证此方法绝对只调用一次
         */
        Singleton() {
            singleton = new EnumSingletonPattern();
        }

        public EnumSingletonPattern getInstance() {
            return singleton;
        }
    }
}
