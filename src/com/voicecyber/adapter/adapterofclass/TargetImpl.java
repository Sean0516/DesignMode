package com.voicecyber.adapter.adapterofclass;

/**
 * Created by Sean on 2018/7/6
 *
 * @author Sean
 */
public class TargetImpl implements ITarget {
    @Override
    public String getUserName() {
        return "hello sean";
    }

    @Override
    public int getUserAge() {
        return 22;
    }
}
