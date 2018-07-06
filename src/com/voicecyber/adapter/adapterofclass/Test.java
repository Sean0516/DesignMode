package com.voicecyber.adapter.adapterofclass;

/**
 * Created by Sean on 2018/7/6
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        ITarget target=new TargetImpl();
        String userName = target.getUserName();
        int userAge = target.getUserAge();
        System.out.println("userName:"+userName +"userAge:"+userAge);
        ITarget target1=new Adapter();
        String userName1 = target1.getUserName();
        int userAge1 = target1.getUserAge();
        System.out.println("customer name:" +userName1 +"customer age:" +userAge1);

    }
}
