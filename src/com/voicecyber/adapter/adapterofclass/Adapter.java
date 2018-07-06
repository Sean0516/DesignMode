package com.voicecyber.adapter.adapterofclass;

/**
 * Created by Sean on 2018/7/6
 *
 * @author Sean
 */
public class Adapter extends AdapteeImpl implements ITarget {
    @Override
    public String getUserName() {
        return super.getCustomerName().toString();
    }

    @Override
    public int getUserAge() {
        long customerAge = super.getCustomerAge();
        return (int) customerAge ;
    }
}
