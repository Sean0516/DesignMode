package com.patternspk.strategtvsstate.state.humanstate;

import com.patternspk.strategtvsstate.state.Human;

/**
 * Created by Sean on 2018/11/8
 *
 * @author Sean
 */
public abstract class HumanState {
    protected Human human;

    public void setHuman(Human human) {
        this.human = human;
    }
    public abstract void work();

}
