package com.voicecyber.abstfactory;

import com.voicecyber.abstfactory.product.AbstractProductA;
import com.voicecyber.abstfactory.product.AbstractProductB;

/**
 * Created by Sean on 2018/6/12.
 * @author Sean
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
