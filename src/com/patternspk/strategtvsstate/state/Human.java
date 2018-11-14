package com.patternspk.strategtvsstate.state;

import com.patternspk.strategtvsstate.state.humanstate.AdultState;
import com.patternspk.strategtvsstate.state.humanstate.ChildState;
import com.patternspk.strategtvsstate.state.humanstate.HumanState;
import com.patternspk.strategtvsstate.state.humanstate.OldState;

/**
 * Created by Sean on 2018/11/8
 *
 * @author Sean
 */
public class Human {
    public static final HumanState CHILD_STATE = new ChildState();
    public static final HumanState ADULT_STATE = new AdultState();
    public static final HumanState OLD_STATE = new OldState();
    private HumanState humanState;

    public void setHumanState(HumanState humanState) {
        this.humanState = humanState;
        this.humanState.setHuman(this);
    }
    public void work(){
        this.humanState.work();
    }
}
