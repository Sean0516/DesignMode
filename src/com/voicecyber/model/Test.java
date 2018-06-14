package com.voicecyber.model;

/**
 * Created by Sean on 2018/6/12
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        AbstractStudentModel highStudent=new HighStudent();
        highStudent.run();
        System.out.println("____________________");
        AbstractStudentModel primaryStudent=new PrimaryStudent();
        primaryStudent.run();
    }
}
