package com.voicecyber.builder;

/**
 * Created by Sean on 2018/6/13
 *
 * @author Sean
 */
public class ConcreteProduct extends AbstractProductBuilder {
    private Product product = new Product();
    @Override
    public void setProduct() {
        product.method2();
        product.method();
    }

    @Override
    public Product buliderProduct() {
        return product;
    }
}
