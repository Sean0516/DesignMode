package com.voicecyber.model;

/**
 * Created by Sean on 2018/6/12
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        AbstractStudentModel highStudent=new HighStudent();
        highStudent.setName("sean");
        String run = highStudent.run();
        System.out.println(run);
        System.out.println("____________________");
        AbstractStudentModel primaryStudent=new PrimaryStudent();
        String run1 = primaryStudent.run();
        System.out.println(run1);
    }
}
