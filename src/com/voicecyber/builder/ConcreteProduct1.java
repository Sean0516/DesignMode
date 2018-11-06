package com.voicecyber.builder;

/**
 * Created by Sean on 2018/11/6
 *
 * @author Sean
 */
public class ConcreteProduct1 extends AbstractProductBuilder {
    private Product product = new Product();
    @Override
    public void setProduct() {
        product.method();
        product.method2();
    }

    @Override
    public Product buliderProduct() {
        return product;
    }
}
