package com.voicecyber.abserver.observerbyjava;


/**
 * Created by Sean on 2018/7/10
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Customer1 customer1=new Customer1();
        Customer2 customer2=new Customer2();
        Producer producer=new Producer();
        producer.addObserver(customer1);
        producer.addObserver(customer2);
        producer.producerProduct1();
        producer.producerProduct2();
    }
}
