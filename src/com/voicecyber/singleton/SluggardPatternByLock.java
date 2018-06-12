package com.voicecyber.singleton;

/**
 * Created by Sean on 2018/6/8.
 *
 * @author Sean
 */
public class SluggardPatternByLock {
    /**
     * volatile 关键字可以禁止指令重排 ：可以确保instance = new SluggardType2()对应的指令不会重排序
     * 但是因为对volatile的操作都在Main Memory中，而Main Memory是被所有线程所共享的，
     * 这里的代价就是牺牲了性能，无法利用寄存器或Cache
     */
    private volatile static SluggardPatternByLock sluggardPatternByLock = null;

    private SluggardPatternByLock() {
    }

    public static SluggardPatternByLock getSluggardPatternByLock() {
        if (sluggardPatternByLock == null) {
            synchronized (SluggardPatternByLock.class) {
                if (sluggardPatternByLock == null) {
                    sluggardPatternByLock = new SluggardPatternByLock();
                }
            }
        }
        return sluggardPatternByLock;
    }

    public static void say() {
        System.out.println("这是懒汉式单例,使用双重校验锁 ，不推荐使用");
    }
}
