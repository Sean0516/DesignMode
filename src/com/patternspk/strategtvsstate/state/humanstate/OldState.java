package com.patternspk.strategtvsstate.state.humanstate;

import com.patternspk.strategtvsstate.state.Human;

/**
 * Created by Sean on 2018/11/8
 *
 * @author Sean
 */
public class OldState extends HumanState {
    @Override
    public void work() {
        System.out.println("老年人的工作状态就是好好休息");
        super.human.setHumanState(Human.CHILD_STATE);
    }
}
