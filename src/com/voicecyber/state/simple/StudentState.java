package com.voicecyber.state.simple;

/**
 * Created by Sean on 2018/10/31
 *
 * @author Sean
 */
public class StudentState extends State {
    @Override
    public void handle1() {
        System.out.println("非本状态 ，设置当前状态为state1  ，并过度到state1 ");
        super.context.setCurrentState(Context.STATE1);
        super.context.handle1();
    }
    @Override
    public void handle2() {
        System.out.println("State2 状态下做的事情");
    }


}
