package com.voicecyber.proxy.staticproxy;

/**
 * Created by Sean on 2018/6/14
 *
 * @author Sean
 */
public class RealSubject implements Subject {
    public RealSubject(Subject subject){
        if (subject==null){
            try {
                throw new Exception("真是角色不能为空");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void doMethod() {
        System.out.println("真实对象的方法");
    }
}
