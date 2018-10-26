package com.voicecyber.prototype.kaobei;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sean on 2018/6/20
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<String> stringList=new ArrayList<>();
        stringList.add("张三");
        Result result=new Result();
        result.setName("sean");
        result.setList(stringList);
        Result result1 = (Result) result.clone();

        System.out.println(result );
//        List<Student> studentList=new ArrayList<>();
//        Student student=new Student("sean",22,"男");
//        student.setArrayList(stringList);
//        studentList.add(student);
//        Student student1 = (Student) student.clone();
//        stringList.add("历史");
//        student1.setArrayList(stringList);
//        studentList.add(student1);
//        System.out.println(studentList);
    }
}
