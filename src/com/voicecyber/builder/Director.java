package com.voicecyber.builder;

/**
 * Created by Sean on 2018/6/13
 *
 * @author Sean
 */
public class Director {
    private AbstractProductBuilder builder=new ConcreteProduct();
    public Product getProduct(){
        builder.setProduct();
        return builder.buliderProduct();
    }
}
