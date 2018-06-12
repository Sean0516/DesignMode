package com.voicecyber.singleton;

/**
 * Created by Sean on 2018/6/8.
 * 借助内部类实现单例模式
 * 特点： 既能实现延时加载，又能实现线程安全
 */
public class InnerClassPattern {
    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例没有绑定关系，而且只有被调用到时才会装载
     * 从而实现了延迟加载
     */
    private static class SingletonHolder {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static InnerClassPattern innerClassPattern = new InnerClassPattern();
    }
    private InnerClassPattern() {
    }
    /**
     * 这个模式的优势在于：getInstance方法并没有被同步，
     * 并且只是执行一个域的访问，因此延迟初始化并没有增加任何访问成本
     *
     * @return
     */
    public static InnerClassPattern getInnerClassPattern() {
        return SingletonHolder.innerClassPattern;
    }
}
