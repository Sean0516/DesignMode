package com.patternspk.strategtvsstate.state.humanstate;

import com.patternspk.strategtvsstate.state.Human;

/**
 * Created by Sean on 2018/11/8
 *
 * @author Sean
 */
public class ChildState extends HumanState {
    @Override
    public void work() {
        System.out.println("儿童的工作状态为玩耍");
        super.human.setHumanState(Human.ADULT_STATE);
    }
}
