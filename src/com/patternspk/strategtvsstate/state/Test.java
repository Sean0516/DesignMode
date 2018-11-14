package com.patternspk.strategtvsstate.state;

import com.patternspk.strategtvsstate.state.humanstate.ChildState;

/**
 * Created by Sean on 2018/11/8
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Human human=new Human();
        human.setHumanState(new ChildState());
        human.work();
        human.work();
        human.work();
        human.work();
    }

}
