package com.voicecyber.abstfactory;


import com.voicecyber.abstfactory.product.AbstractProductA;
import com.voicecyber.abstfactory.product.AbstractProductB;
import com.voicecyber.abstfactory.product.ProductA1;
import com.voicecyber.abstfactory.product.ProductB1;

/**
 * Created by Sean on 2018/6/12.
 * @author Sean
 */
public class Product1Factory extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
