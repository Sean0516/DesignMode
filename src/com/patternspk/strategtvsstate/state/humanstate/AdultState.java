package com.patternspk.strategtvsstate.state.humanstate;

import com.patternspk.strategtvsstate.state.Human;

/**
 * Created by Sean on 2018/11/8
 *
 * @author Sean
 */
public class AdultState extends HumanState {
    @Override
    public void work() {
        System.out.println("成年人的工作状态为 养活自己，和家人");
        super.human.setHumanState(Human.OLD_STATE);
    }
}
