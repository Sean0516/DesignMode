package com.voicecyber.state.simple;

/**
 * Created by Sean on 2018/11/1
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Context context=new Context();
        context.setCurrentState(new UserState());
        context.handle1();
        context.handle2();
    }
}
