package com.voicecyber.adapter.adapterofclass;

/**
 * Created by Sean on 2018/7/6
 *
 * @author Sean
 */
public class AdapteeImpl implements IAdaptee {
    @Override
    public StringBuilder getCustomerName() {
        StringBuilder str=new StringBuilder();
        str.append("hello  this is customer name");
        return str;
    }

    @Override
    public long getCustomerAge() {
        return 10L;
    }
}
