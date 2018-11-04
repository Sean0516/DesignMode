package com.voicecyber.state.simple;

/**
 * Created by Sean on 2018/10/31
 *
 * @author Sean
 */
public class UserState extends State {
    @Override
    public void handle1() {
        System.out.println("State 1 状态下做的事情");
    }

    @Override
    public void handle2() {
        System.out.println("非本状态 ，设置当前状态为state2  ，并过度到state2 ");
        super.context.setCurrentState(Context.STATE2);
        super.context.handle2();
    }
}
