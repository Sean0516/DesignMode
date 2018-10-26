package com.voicecyber.facede.face;

import com.voicecyber.facede.service.ClassA;
import com.voicecyber.facede.service.ClassB;

/**
 * Created by Sean on 2018/10/26
 *
 * @author Sean
 */
public class Facade {
    private ClassA classA=new ClassA();
    private ClassB classB=new ClassB();
    public  void doMethod(){
        classA.sayA();
        classB.sayB();
    }

    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.doMethod();
    }
}
