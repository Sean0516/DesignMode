package com.voicecyber.singleton;

/**
 * Created by Sean on 2018/6/8.
 */

/**
 * 懒汉式单例
 * 延时加载  线程不安全，多线程下不能正常工作
 * @author Sean
 */
public class SluggardPattern {
    private static SluggardPattern sluggardPattern=null;
    private SluggardPattern(){}
    public  static  SluggardPattern getSluggardPattern(){
        if (sluggardPattern==null){
            sluggardPattern=new SluggardPattern();
        }
        return sluggardPattern;
    }
    public static void say(){
        System.out.println("这是线程不安全的懒汉式单例");
    }
}
