package com.voicecyber.builder;

import java.security.Principal;

/**
 * Created by Sean on 2018/6/13
 *
 * @author Sean
 */
public class Director {
    private AbstractProductBuilder builder=new ConcreteProduct();
    private AbstractProductBuilder builder1=new ConcreteProduct1();
    public Product getProduct(){
        builder.setProduct();
        return builder.buliderProduct();
    }
    public Product getProduct1(){
        builder1.setProduct();
        return builder1.buliderProduct();
    }
}
