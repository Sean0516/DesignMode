package com.voicecyber.abstfactory;

import com.voicecyber.abstfactory.product.AbstractProductA;
import com.voicecyber.abstfactory.product.AbstractProductB;
import com.voicecyber.abstfactory.product.ProductA2;
import com.voicecyber.abstfactory.product.ProductB2;

/**
 * Created by Sean on 2018/6/12.
 */
public class Product2Factory extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }
    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
